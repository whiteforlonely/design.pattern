package com.ake.designpattern.singleton.demo3;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/13 9:01
 *
 * 懒汉模式1是不安全的
 */
public class Lazy01 {

    private static Lazy01 lazy01;

    private Lazy01() {

    }

    public static Lazy01 getInstance() {
        if (lazy01 == null) {
            lazy01 = new Lazy01();
        }
        return lazy01;
    }
}
