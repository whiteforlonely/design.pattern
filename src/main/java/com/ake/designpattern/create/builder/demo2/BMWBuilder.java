package com.ake.designpattern.create.builder.demo2;

import java.util.List;

/**
 * 创建具体的创建类，这个过程的创建细节
 * 应该是针对于产品进行特定规划的。
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    CarModel getCarModel() {
        return this.bmwModel;
    }

    @Override
    void setSequences(List<String> sequences) {
        this.bmwModel.setSequence(sequences);
    }
}
