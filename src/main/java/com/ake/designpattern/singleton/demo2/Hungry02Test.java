package com.ake.designpattern.singleton.demo2;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/13 9:00
 */
public class Hungry02Test {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Hungry02.getInstance());
            }).start();
        }
    }
}
