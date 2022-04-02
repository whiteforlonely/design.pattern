package com.ake.designpattern.struct.agent.demo1;

/**
 * 运动员
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class Runner implements IRunner{
    @Override
    public void run() {
        System.out.println("runner is running, the action is perfect!");
    }
}
