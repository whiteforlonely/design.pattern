package com.ake.designpattern.create.builder.demo2;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class BenzModel extends CarModel{

    @Override
    protected void start() {
        System.out.println("benz start.");
    }

    @Override
    protected void stop() {
        System.out.println("benz stop.");
    }

    @Override
    protected void alarm() {
        System.out.println("benz alarm.");
    }

    @Override
    protected void engineBoom() {
        System.out.println("benz engine boom.");
    }
}
