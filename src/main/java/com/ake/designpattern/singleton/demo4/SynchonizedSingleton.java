package com.ake.designpattern.singleton.demo4;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 19:58
 */
public class SynchonizedSingleton {

    private static SynchonizedSingleton instance;

    private SynchonizedSingleton() {
    }

    public synchronized static SynchonizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchonizedSingleton();
        }
        return instance;
    }
}
