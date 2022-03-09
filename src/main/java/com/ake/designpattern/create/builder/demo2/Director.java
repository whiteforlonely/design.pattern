package com.ake.designpattern.create.builder.demo2;

import java.util.ArrayList;

/**
 * 指挥者，用来创建对应的carmodel
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getBenzModel1(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("Stop");

        this.benzBuilder.setSequences(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBenzModel2(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("Stop");

        this.benzBuilder.setSequences(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getBmwModel1(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engine boom");
        this.sequence.add("Stop");

        this.bmwBuilder.setSequences(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

    public BMWModel getBmwModel2(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engine boom");
        this.sequence.add("alarm");

        this.bmwBuilder.setSequences(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
