package com.ake.designpattern.singleton.demo7;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 20:20
 *
 * 在没有相关类要继承的情况下是可以使用的。
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                EnumSingleton instance = EnumSingleton.INSTANCE;
                instance.doSomething();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
