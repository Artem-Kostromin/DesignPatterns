package behavior.strategy.impl;

import behavior.strategy.FlyBehavior;

public class NoWayFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant(");
    }
}
