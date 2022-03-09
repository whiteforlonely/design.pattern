package com.ake.designpattern.create.builder.demo2;

import java.util.List;

/**
 * 抽象创建者
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public abstract class CarBuilder {

    abstract CarModel getCarModel();

    abstract void setSequences(List<String> sequences);
}
