package com.ake.designpattern.visitor.demo4;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/4/2
 * @version V1.0
 */
public class YoungActor extends Actor{

    @Override
    public void act(KongFuRole role) {
        System.out.println("young actor call kongfu role");
    }
}
