package com.ake.designpattern.singleton.demo6;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 20:04
 */
public class StaticInnerClass {

    /**
     * 这边为什么要用到static呢，不用也是可以的，但是有可能会出现什么问题呢？
     * */
    static class InnerSingleton {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }

    private StaticInnerClass(){}

    public static StaticInnerClass getInstance(){
        return InnerSingleton.instance;
    }
}
