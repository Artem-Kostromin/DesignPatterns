package structural.decorator.head_first.impl;

import structural.decorator.head_first.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public Float cost() {
        return 0.7f;
    }
}
