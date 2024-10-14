package structural.decorator.head_first;

import structural.decorator.head_first.impl.Chocolate;
import structural.decorator.head_first.impl.DarkRoast;
import structural.decorator.head_first.impl.Espresso;
import structural.decorator.head_first.impl.Milk;

/**
 * Паттерн позволяет длинамически ннаделять объекты нвоыми
 * возможности и является гибкоц альтернативой субклассированию
 */
public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.cost());
        System.out.println(espresso.getDescription());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Milk(beverage2);
        beverage2 = new Chocolate(beverage2);
        System.out.println(beverage2.cost());
        System.out.println(beverage2.getDescription());
    }
}
