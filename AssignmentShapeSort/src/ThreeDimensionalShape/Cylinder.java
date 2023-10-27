package ThreeDimensionalShape;

public class Cylinder extends ThreeDimensionalShape {
    public Cylinder(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the cylinder
        return Math.PI * sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for a cylinder
        return Math.PI * sideLength * sideLength * height;
    }
    
    @Override
    public String toString() {
    return "Cylinder [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
