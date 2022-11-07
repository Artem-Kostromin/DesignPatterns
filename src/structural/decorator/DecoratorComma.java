package structural.decorator;

public class DecoratorComma extends Decorator{
    public DecoratorComma(InterfaceComponent component) {
        super(component);
    }

    @Override
    public void doOperation() {
        System.out.println(",");
        super.doOperation();
    }

    @Override
    public void newFunction() {
        System.out.println("Add comma");
    }
}
