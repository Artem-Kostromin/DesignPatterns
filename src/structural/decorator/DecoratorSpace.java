package structural.decorator;

public class DecoratorSpace extends Decorator {
    public DecoratorSpace(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newFunction() {
        System.out.println("Add space");
    }
}
