package ThreeDimensionalShape;

/**
 * An abstract class representing a three-dimensional shape.
 * It implements the Comparable interface to allow height-based comparisons between shapes.
 * Subclasses must provide methods to implement calculating the shape's area and volume.
 *
 * @author Matt Yackel
 */
public abstract class ThreeDimensionalShape implements Comparable<ThreeDimensionalShape>{
    /**
     * The length of the side of the shape.
     */
    public double sideLength;
    /**
     * The height of the shape.
     */
    public double height;

    /**
     * Constructor for a three-dimensional shape object with specified height and side length.
     *
     * @param height     The height of the shape.
     * @param sideLength The side length of the shape.
     */
    public ThreeDimensionalShape(double height, double sideLength) {
        
        this.height = height;
        this.sideLength = sideLength;
    }

    /**
     * Calculate and return the area of the shape.
     *
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Calculate and return the volume of the shape.
     *
     * @return The volume of the shape.
     */
    public abstract double getVolume();

    /**
     * Compares the current shape's height to another shape's height. 
     *
     * @param o The other shape to compare to. 
     * @return -1 if the current shape's height is greater than the other shape, 1 if it's smaller, or 0 if they are equal.
     */
    @Override
    public int compareTo(ThreeDimensionalShape o) {
        if (this.height > o.height) {
            return -1;
        } else if (this.height < o.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
