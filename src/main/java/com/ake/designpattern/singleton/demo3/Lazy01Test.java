package com.ake.designpattern.singleton.demo3;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/13 9:02
 */
public class Lazy01Test {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Lazy01.getInstance().hashCode());
            }).start();
        }
    }
    /**
     * output:
     * 1463233776
     * 1640880255
     * 1640880255
     * 1640880255
     * 1640880255
     * */
}
