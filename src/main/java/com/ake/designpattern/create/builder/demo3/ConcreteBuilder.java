package com.ake.designpattern.create.builder.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class ConcreteBuilder extends Builder{

    private Product product = new Product();

    @Override
    void setPart() {
        // 产品内部逻辑处理，会使用到对应的产品对象product
    }

    @Override
    Product buildProduct() {
        return product;
    }
}
