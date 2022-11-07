package structural.decorator;

import javax.lang.model.element.NestingKind;

public class Main {

    public static void main (String... s) {
        Decorator c = new DecoratorComma(new DecoratorSpace(new MainComponent()));
        c.doOperation();
        c.newFunction();
    }

}
