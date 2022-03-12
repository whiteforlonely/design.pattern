package com.ake.designpattern.observer.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * redis节点，这边同事用到组合模式来对
 *
 * @author : Saturday
 * date 2022/3/12
 * @version V1.0
 */
public class RedisNode extends Observable {

    // 节点类型
    private String type;

    // 节点编号
    private int nodeId;

    // 是否正常运行
    private volatile boolean normalRunning;

    // 对应的master节点
    private RedisNode master;

    // 对应的slave节点
    private List<RedisNode> slaves;

    private RedisNode pre;

    private RedisNode next;

    private static AtomicInteger nextId = new AtomicInteger(0);
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(9);

    public RedisNode(String type) {
        this.type = type;
        this.slaves = new ArrayList<>();
        this.nodeId = nextId.incrementAndGet();
    }

    public void addSlave(RedisNode slave){
        this.slaves.add(slave);
    }

    public void setMaster(RedisNode master) {
        this.master = master;
    }

    public RedisNode getMaster() {
        return master;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPre(RedisNode pre) {
        this.pre = pre;
    }

    public void setNext(RedisNode next) {
        this.next = next;
    }

    // 启动服务
    public void startup() {
        this.normalRunning = true;
        System.out.println(type + " is now running!");
        // 5S发送一次健康报告
        scheduledExecutorService.scheduleAtFixedRate(()->{
            RedisNode.this.setChanged();
            if (RedisNode.this.normalRunning) {
                RedisNode.this.notifyObservers("normal");
            } else {
                RedisNode.this.notifyObservers("fail");
            }
        }, 0, 5, TimeUnit.SECONDS);
    }

    // 节点挂掉，通知哨兵
    public void fail() {
        this.normalRunning = false;
    }

    public boolean isNormalRunning() {
        return normalRunning;
    }

    public int getNodeId() {
        return nodeId;
    }

    public String getType() {
        return type;
    }

    public void removeSelf(){
        // 把自己从slave数组中删除
        if (null != master) {
            List<RedisNode> slaveList = master.slaves;
            if (null != slaveList && slaveList.size() > 0) {
                slaveList.removeIf(s -> s.getNodeId() == nodeId);
            }
        }
    }

    // 进行节点更换
    public void updateMaster(){
        if (RedisNodeTypeEnum.MASTER.name().equalsIgnoreCase(this.type)) {
            // 更换主节点逻辑:
            if (this.slaves.size() > 0) {
                // 1. 找到可用的slave节点
                RedisNode replaceMaster = slaves.get(0);
                this.slaves.remove(0);
                // 2. 更新节点角色
                replaceMaster.setMaster(null);
                this.slaves.forEach(s -> {
                    // 3. 绑定所有的slave节点
                    replaceMaster.addSlave(s);
                    s.setMaster(replaceMaster);
                });
                // 4. 移除掉master节点
                this.slaves.clear();
                // 5. 新master节点和其他的master节点联通
                replaceMaster.pre = master.pre;
                replaceMaster.next = master.next;
                master.pre = null;
                master.next = null;
            }
        }
    }
}
