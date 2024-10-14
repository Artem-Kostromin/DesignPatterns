package structural.decorator.head_first;

public abstract class Beverage {
    protected String description = "Unknown beverage";

    public abstract Float cost();

    public String getDescription() {
        return description;
    }
}
