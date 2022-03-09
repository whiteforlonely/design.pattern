package com.ake.designpattern.create.builder.demo2;

import java.util.List;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();

    @Override
    CarModel getCarModel() {
        return benzModel;
    }

    @Override
    void setSequences(List<String> sequences) {
        benzModel.setSequence(sequences);
    }
}
