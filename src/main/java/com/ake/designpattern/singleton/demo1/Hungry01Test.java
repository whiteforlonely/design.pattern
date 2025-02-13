package com.ake.designpattern.singleton.demo1;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/13 8:55
 */
public class Hungry01Test {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Hungry01.getInstance())).start();
        }
    }
}
