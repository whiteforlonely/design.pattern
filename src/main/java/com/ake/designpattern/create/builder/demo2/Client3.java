package com.ake.designpattern.create.builder.demo2;

/**
 * 具有导演类的实现示例
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Client3 {

    public static void main(String[] args) {
        Director director = new Director();

        director.getBenzModel1().run();
        System.out.println("======================");
        director.getBenzModel2().run();
        System.out.println("======================");
        director.getBmwModel1().run();
        System.out.println("======================");
        director.getBmwModel2().run();
    }
}
