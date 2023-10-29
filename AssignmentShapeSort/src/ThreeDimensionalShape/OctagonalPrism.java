package ThreeDimensionalShape;

public class OctagonalPrism extends ThreeDimensionalShape {
    /**
     * Constructor for a octagonal prism object with specified height and side length.
     *
     * @param height The height of the octagonal prism.
     * @param sideLength The side length of the base of the octagonal prism.
     */
    public OctagonalPrism(double height, double sideLength) {
        super(height, sideLength);
    }

    /**
     * Calculate and return the base area of the octagonal prism.
     */
    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * (sideLength * sideLength);
    }

    /**
     * Calculate and return the volume of the octagonal prism.
     */
    @Override
    public double getVolume() {
        return getArea() * height;
    }
    
    /**
     * Returns information about the octagonal prism object as a string.
     *
     * @return A string containing information about the octagonal prism including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "OctagonalPrisms [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
