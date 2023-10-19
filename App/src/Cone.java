public class Cone extends ThreeDimensionalShape {
    private double radius;

    public Cone(double radius, double height) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * (radius * radius) * height;
    }
}
