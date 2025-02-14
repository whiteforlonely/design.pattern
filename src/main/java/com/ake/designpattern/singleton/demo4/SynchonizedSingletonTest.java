package com.ake.designpattern.singleton.demo4;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 20:00
 */
public class SynchonizedSingletonTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SynchonizedSingleton.getInstance());
                }
            }).start();
        }
    }
}
