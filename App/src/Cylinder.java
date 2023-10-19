public class Cylinder extends ThreeDimensionalShape {
    public double radius;

    public Cylinder(double radius, double height) {
        super(height);
        this.radius = radius;
    }   

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getVolume() {
        return Math.PI * (radius * radius) * height;
    }
    
}
