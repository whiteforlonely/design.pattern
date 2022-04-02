package com.ake.designpattern.decorator.demo2;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class Client {

    public static void main(String[] args) {
        IRunner runner = new Runner();
        IRunner jetRunner = new RunnerWithJet(runner);

        System.out.println("start to run with jet in runner");
        jetRunner.run();
    }
}
