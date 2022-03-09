package com.ake.designpattern.create.builder.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过构建者来创建对应的产品
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Client2 {

    public static void main(String[] args) {

        List<String> sequences = new ArrayList<>();
        sequences.add("start");
        sequences.add("alarm");
        sequences.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequences(sequences);
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        benzModel.run();

        System.out.println("======================");

        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequences(sequences);
        BMWModel bmwModel = (BMWModel) bmwBuilder.getCarModel();
        bmwModel.run();
    }
}
