package com.ake.designpattern.visitor.demo4;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/4/2
 * @version V1.0
 */
public abstract class Actor {

    public void act(Role role){
        System.out.println("actor call role original");
    }

    public void act(KongFuRole role) {
        System.out.println("actor call kongfu role");
    }
}
