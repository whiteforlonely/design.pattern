package com.ake.designpattern.singleton.demo6;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 20:13
 */
public class StaticInnerClassTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(StaticInnerClass.getInstance());
            }).start();
        }
    }
}
