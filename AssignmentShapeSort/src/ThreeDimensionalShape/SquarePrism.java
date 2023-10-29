package ThreeDimensionalShape;

public class SquarePrism extends ThreeDimensionalShape {
    /**
     * Constructor for a square prism object with specified height and side length.
     *
     * @param height The height of the square prism.
     * @param sideLength The side length of the base of the square prism.
     */
    public SquarePrism(double height, double sideLength) {
        super(height, sideLength);
    }

    /**
     * Calculate and return the base area of the square prism.
     */
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    /**
     * Calculate and return the volume of the square prism.
     */
    @Override
    public double getVolume() {
        return sideLength * sideLength * height;
    }
    
    /**
     * Returns information about the square prism object as a string.
     *
     * @return A string containing information about the square prism including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "SquarePrism [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}