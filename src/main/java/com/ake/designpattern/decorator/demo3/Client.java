package com.ake.designpattern.decorator.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class Client {

    public static void main(String[] args) {

        Swan uglyDucking = new BeautyApperance(new StrongerBehavior(new UglyDucking()));
        uglyDucking.descAppearance();
        uglyDucking.fly();
        uglyDucking.cry();

    }
}
