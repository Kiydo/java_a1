package ThreeDimensionalShape;

public class SquarePrism extends ThreeDimensionalShape {
    public SquarePrism(double height, double sideLength) {
        super(height, sideLength);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the square prism
        return sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for a square prism
        return sideLength * sideLength * height;
    }
    
    @Override
    public String toString() {
    return "SquarePrism [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}