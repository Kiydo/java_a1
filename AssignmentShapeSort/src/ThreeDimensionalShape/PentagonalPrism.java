package ThreeDimensionalShape;

public class PentagonalPrism extends ThreeDimensionalShape {
    public PentagonalPrism(double height, double sideLength) {
        super(height, sideLength);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the pentagonal prism
        double degrees = 54;
        return 5 * (sideLength * sideLength) * (Math.tan(Math.toRadians(degrees)) / 4);
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for a pentagonal prism
        return getArea() * height;
    }
    
    @Override
    public String toString() {
    return "PentagonalPrism [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}