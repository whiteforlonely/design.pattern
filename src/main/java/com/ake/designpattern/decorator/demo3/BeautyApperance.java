package com.ake.designpattern.decorator.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class BeautyApperance extends Decorator{

    public BeautyApperance(Swan swan) {
        super(swan);
    }

    @Override
    public void descAppearance() {
        System.out.println("beautiful appearance and white feather, looks cute.");
    }
}
