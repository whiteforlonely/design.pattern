package com.ake.designpattern.create.builder.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 这边的这种编程思想也算是创建者模式中的一种吗？
 * 现在是创建者模式的开始，中间的灵活性已经是有体现出来了。
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Client1 {

    public static void main(String[] args) {
        List<String> sequences = new ArrayList<>();
        sequences.add("start");
        sequences.add("engine boom");
        sequences.add("stop");

        CarModel benzModel = new BenzModel();
        benzModel.setSequence(sequences);
        benzModel.run();

        CarModel bmwModel = new BMWModel();
        bmwModel.setSequence(sequences);
        bmwModel.run();
    }
}
