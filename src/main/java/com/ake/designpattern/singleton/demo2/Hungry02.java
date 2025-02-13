package com.ake.designpattern.singleton.demo2;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/13 8:58
 */
public class Hungry02 {

    private static Hungry02 instance;

    static {
        instance = new Hungry02();
    }

    private Hungry02(){}

    public static Hungry02 getInstance() {
        return instance;
    }
}
