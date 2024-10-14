package structural.decorator.head_first.impl;

import structural.decorator.head_first.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark roast";
    }

    @Override
    public Float cost() {
        return 0.9f;
    }
}
