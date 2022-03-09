package com.ake.designpattern.create.builder.demo1;

/**
 * 创建者模式中的产品，这个也是一个抽象产品
 * Builder模式，将一个复杂对象的表现形式和创建过程分离开来，使得通过不同的创建过程，可以产出不同的表现形式的对象。
 * 创建者模式，需要明确几个对象，Product， AbstractBuilder, ConcreteBuilder, Director, Client
 *
 * @author : Saturday
 * date 2021/8/31
 * @version V1.0
 */
public abstract class Computer {

    private String m1;

    abstract static class Builder{
        abstract Computer create1(String materials);
    }
}
