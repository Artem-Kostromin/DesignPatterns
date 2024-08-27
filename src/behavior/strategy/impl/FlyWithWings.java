package behavior.strategy.impl;

import behavior.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
