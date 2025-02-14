package com.ake.designpattern.singleton.demo5;

/**
 * @author saturday
 * @version 1.0.0
 * date: 2025/2/14 20:02
 */
public class DoubleCheck {

    private static volatile DoubleCheck instance;

    private DoubleCheck()
    {

    }

    public static DoubleCheck getInstance()
    {
        if (instance == null)
        {
            synchronized (DoubleCheck.class)
            {
                if (instance == null)
                {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
