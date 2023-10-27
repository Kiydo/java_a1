package ThreeDimensionalShape;

public class Pyramid extends ThreeDimensionalShape {
    public Pyramid(double height, double baseLength) {
        super(height, baseLength);
    }

    @Override
    public double getArea() {
        // Calculate and return only the base area of the pyramid
        return sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        // Implement the volume calculation for a pyramid
        return (1.0 / 3) * sideLength * sideLength * height;
    }
    
    @Override
    public String toString() {
    return "Pyramid [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
