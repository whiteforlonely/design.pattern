package com.ake.designpattern.decorator.demo3;

/**
 * TODO
 *
 * @author : Saturday
 * date 2022/3/25
 * @version V1.0
 */
public class Decorator implements Swan{

    private final Swan swan;

    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        this.swan.fly();
    }

    @Override
    public void cry() {
        this.swan.cry();
    }

    @Override
    public void descAppearance() {
        this.swan.descAppearance();
    }
}
