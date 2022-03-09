package com.ake.designpattern.create.builder.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public abstract class Builder {

    // 定制产品的过程
    abstract void setPart();

    // 返回产品信息
    abstract Product buildProduct();
}
