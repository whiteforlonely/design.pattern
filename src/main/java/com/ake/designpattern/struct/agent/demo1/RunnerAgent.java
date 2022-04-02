package com.ake.designpattern.struct.agent.demo1;

import java.util.Random;

/**
 * 运动员代理
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class RunnerAgent implements IRunner{

    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("agent agree runner to run,");
            this.runner.run();
        } else {
            System.out.println("agent disagree runner to run!");
        }
    }
}
