package com.ake.designpattern.singleton.demo1;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/13 8:54
 */
public class Hungry01 {

    private final static Hungry01 instance = new Hungry01();

    private Hungry01(){}

    public static Hungry01 getInstance(){
        return instance;
    }
}
