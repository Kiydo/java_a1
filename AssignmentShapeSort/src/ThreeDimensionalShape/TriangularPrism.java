package ThreeDimensionalShape;

/**
 * A class representing a three-dimensional triangular prism shape.
 * 
 * @author Team2
 */
public class TriangularPrism extends ThreeDimensionalShape {
    /**
     * Constructor for a triangular prism object with specified height and side length.
     *
     * @param height The height of the triangular prism.
     * @param sideLength The side length of the triangular prism.
     */
    public TriangularPrism(double height, double sideLength) {
        super(height, sideLength);
    }

    /**
     * Calculate and return the base area of the triangular prism.
     *
     * @return The base area of the triangular prism.
     */
    @Override
    public double getArea() {
        return 0.5 * sideLength * sideLength;
    }

    /**
     * Calculate and return the volume of the triangular prism.
     *
     * @return The volume of the triangular prism.
     */
    @Override
    public double getVolume() {
        return 0.5 * sideLength * sideLength * height;
    }
    
    /**
     * Returns information about the triangular prism object as a string.
     *
     * @return A string containing information about the triangular prism including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "Triangular [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
