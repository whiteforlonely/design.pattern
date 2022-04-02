package com.ake.designpattern.visitor.demo4;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/4/2
 * @version V1.0
 */
public class OldActor extends Actor{

    @Override
    public void act(KongFuRole role) {
        System.out.println("Old actor call kongfu role");
    }
}
