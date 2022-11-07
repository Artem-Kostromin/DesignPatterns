package structural.adapter;

public class SquarePegAdapter extends CirclePeg{
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(squarePeg.height^2 + squarePeg.weight^2)/2;
    }
}
