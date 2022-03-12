package com.ake.designpattern.observer.demo3;

import java.util.Observable;
import java.util.Observer;

/**
 * 哨兵类
 *
 * @author : Saturday
 * date 2022/3/12
 * @version V1.0
 */
public class Sentinel implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        RedisNode node = (RedisNode) o;
        System.out.println("redis node " + ((RedisNode) o).getNodeId() +" run normal or not: " + arg.toString());
        if (arg.equals("fail")) {
            // 如果时候主节点，并且是挂掉了，需要更新主节点
            if (RedisNodeTypeEnum.MASTER.name().equalsIgnoreCase(node.getType())) {
                node.updateMaster();
            } else {
                // slave节点挂掉了
                node.removeSelf();
            }
        }
    }
}
