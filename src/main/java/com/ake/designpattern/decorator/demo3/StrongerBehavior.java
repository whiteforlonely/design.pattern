package com.ake.designpattern.decorator.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class StrongerBehavior extends Decorator{

    public StrongerBehavior(Swan swan) {
        super(swan);
    }

    @Override
    public void fly() {
        System.out.println("I can fly now!");
    }
}
