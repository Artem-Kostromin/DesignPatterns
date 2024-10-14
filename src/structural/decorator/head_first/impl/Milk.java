package structural.decorator.head_first.impl;

import structural.decorator.head_first.Beverage;
import structural.decorator.head_first.CondimentDecorator;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Float cost() {
        return beverage.cost() + 0.2f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }
}
