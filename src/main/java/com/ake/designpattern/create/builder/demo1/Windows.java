package com.ake.designpattern.create.builder.demo1;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Windows extends Computer{

    static class Builder extends Computer.Builder{

        Computer create1(String materials) {
            System.out.println("this is window os computer, " + materials);
            return new Windows();
        }
    }
}
