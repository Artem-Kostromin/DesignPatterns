package structural.decorator;

abstract class Decorator implements InterfaceComponent{
    private InterfaceComponent component;

    public Decorator(InterfaceComponent component) {
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }

    public void newFunction(){
        System.out.println("New function of decorator");
    }
}
