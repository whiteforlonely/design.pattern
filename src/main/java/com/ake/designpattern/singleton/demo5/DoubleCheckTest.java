package com.ake.designpattern.singleton.demo5;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 20:03
 */
public class DoubleCheckTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(DoubleCheck.getInstance());
            }).start();
        }
    }
}
