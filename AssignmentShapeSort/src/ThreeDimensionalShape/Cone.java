package ThreeDimensionalShape;

public class Cone extends ThreeDimensionalShape {
    public Cone(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the cone
        return Math.PI * sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for a cone
        return (1.0/3) * Math.PI * sideLength * sideLength * height;
    }
    

    @Override
    public String toString() {
    return "Cone [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}