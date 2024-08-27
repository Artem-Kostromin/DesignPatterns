package behavior.strategy.impl;

import behavior.strategy.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }
}
