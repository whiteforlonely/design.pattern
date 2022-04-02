package com.ake.designpattern.decorator.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class UglyDucking implements Swan{


    @Override
    public void fly() {
        System.out.println("can't fly");
    }

    @Override
    public void cry() {
        System.out.println("guage, guage");
    }

    @Override
    public void descAppearance() {
        System.out.println("white, dirty body, hairy head");
    }
}
