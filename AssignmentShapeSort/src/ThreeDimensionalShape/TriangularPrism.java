package ThreeDimensionalShape;

public class TriangularPrism extends ThreeDimensionalShape {
    public TriangularPrism(double height, double sideLength) {
        super(height, sideLength);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the triangular prism
        return 0.5 * sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for a triangular prism
        return 0.5 * sideLength * sideLength * height;
    }
    
    @Override
    public String toString() {
    return "Triangular [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
