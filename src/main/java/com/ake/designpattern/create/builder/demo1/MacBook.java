package com.ake.designpattern.create.builder.demo1;

/**
 * TODO
 *
 * @author : Saturday
 * date 2021/8/31
 * @version V1.0
 */
public class MacBook extends Computer{

    static class Builder extends Computer.Builder {

        Computer create1(String materials) {
            System.out.println("this is macbook os computer, " + materials);
            return new MacBook();
        }
    }
}
