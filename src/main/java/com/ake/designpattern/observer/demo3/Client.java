package com.ake.designpattern.observer.demo3;

/**
 * 模拟redis集群场景
 *
 * @author : Saturday
 * date 2022/3/12
 * @version V1.0
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {

        RedisNode master1 = new RedisNode(RedisNodeTypeEnum.MASTER.name());
        RedisNode master2 = new RedisNode(RedisNodeTypeEnum.MASTER.name());
        RedisNode master3 = new RedisNode(RedisNodeTypeEnum.MASTER.name());
        RedisNode slave1 = new RedisNode(RedisNodeTypeEnum.SLAVE.name());
        RedisNode slave2 = new RedisNode(RedisNodeTypeEnum.SLAVE.name());
        RedisNode slave3 = new RedisNode(RedisNodeTypeEnum.SLAVE.name());
        master1.setPre(master3);
        master1.setNext(master2);
        master2.setPre(master1);
        master2.setNext(master3);
        master3.setPre(master2);
        master3.setNext(master1);

        master1.addSlave(slave1);
        master2.addSlave(slave2);
        master3.addSlave(slave3);

        Sentinel sentinel = new Sentinel();
        master1.addObserver(sentinel);
        master2.addObserver(sentinel);
        master3.addObserver(sentinel);
        slave1.addObserver(sentinel);
        slave2.addObserver(sentinel);
        slave3.addObserver(sentinel);

        master1.startup();
        master2.startup();
        master3.startup();
        slave1.startup();
        slave2.startup();
        slave3.startup();

//        Thread.sleep(60000);
    }
}
