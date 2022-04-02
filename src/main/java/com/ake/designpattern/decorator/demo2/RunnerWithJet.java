package com.ake.designpattern.decorator.demo2;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class RunnerWithJet implements IRunner{

    IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("ready run with jet!");
        this.runner.run();
    }
}
