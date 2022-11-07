package structural.adapter;

public class CircleHole {
    private double radius;

    public CircleHole() {
    }

    public CircleHole(int radius) {
        this.radius = radius;
    }

    public boolean TryToInsert(CirclePeg circlePeg){
        return circlePeg.getRadius() <= radius;
    }

}
