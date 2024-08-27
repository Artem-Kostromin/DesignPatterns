package behavior.strategy;

import behavior.strategy.impl.MallardDuck;
import behavior.strategy.impl.Quack;
import behavior.strategy.impl.RubberDuck;

/**
 * Паттерн Стратегия определяет семейство ал-
 * горитмов, инкапсулирует каждый из них и обе-
 * спечивает их взаимозаменяемость. Он позво-
 * ляет модифицировать алгоритмы независимо
 * от их использования на стороне клиента.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.quack();
        mallardDuck.fly();

        rubberDuck.quack();
        rubberDuck.fly();

        rubberDuck.setQuackBehavior(new Quack());
        rubberDuck.quack();
    }
}
