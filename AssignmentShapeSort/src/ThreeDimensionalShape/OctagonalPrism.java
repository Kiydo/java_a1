package ThreeDimensionalShape;

public class OctagonalPrism extends ThreeDimensionalShape {
    public OctagonalPrism(double height, double sideLength) {
        super(height, sideLength);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the octagonal prism
        return 2 * (1 + Math.sqrt(2)) * (sideLength * sideLength);
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for an octagonal prism
        return getArea() * height;
    }
    
    @Override
    public String toString() {
    return "OctagonalPrisms [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
