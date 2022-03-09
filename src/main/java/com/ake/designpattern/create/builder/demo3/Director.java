package com.ake.designpattern.create.builder.demo3;

/**
 * 导演类要去根据指定的需求创建不同过程的产品，在实际的应用过程中，应该也是有很多地方
 * 使用到这个设计模式的，其中的以实config的配置应该有用到这个设计模式，因为针对
 * 于不同的配置，需要构建的过程是不一样的。
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Director {

    private Builder builder = new ConcreteBuilder();

    public Product getProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
