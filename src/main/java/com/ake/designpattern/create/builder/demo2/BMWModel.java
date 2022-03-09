package com.ake.designpattern.create.builder.demo2;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class BMWModel extends CarModel{

    @Override
    protected void start() {
        System.out.println("bmw start.");
    }

    @Override
    protected void stop() {
        System.out.println("bmw stop.");
    }

    @Override
    protected void alarm() {
        System.out.println("bmw alarm.");
    }

    @Override
    protected void engineBoom() {
        System.out.println("bmw engine boom.");
    }
}
