package behavior.strategy.impl;

import behavior.strategy.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new NoWayFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
