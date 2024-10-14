package structural.decorator.head_first.impl;

import structural.decorator.head_first.Beverage;
import structural.decorator.head_first.CondimentDecorator;

public class Chocolate extends CondimentDecorator {

    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Float cost() {
        return beverage.cost() + 0.3f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", chocolate";
    }
}
