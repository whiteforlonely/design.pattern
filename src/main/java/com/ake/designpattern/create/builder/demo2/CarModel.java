package com.ake.designpattern.create.builder.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/9
 * @version V1.0
 */
public abstract class CarModel {

    private List<String> sequences = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public void run() {
        sequences.forEach(s -> {
            if (s.equalsIgnoreCase("start")) {
                start();
            } else if (s.equalsIgnoreCase("stop")) {
                stop();
            } else if (s.equalsIgnoreCase("alarm")) {
                alarm();
            } else if (s.equalsIgnoreCase("engine boom")) {
                engineBoom();
            }
        });
    }

    public final void setSequence(List<String> sequences) {
        this.sequences = sequences;
    }

}
