package com.ake.designpattern.struct.agent.demo1;

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
        IRunner agent = new RunnerAgent(runner);
        System.out.println("find agent and ask runner to run===");
        agent.run();
    }
}
