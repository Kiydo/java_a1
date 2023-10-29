package ThreeDimensionalShape;

/**
 * A class representing a three-dimensional cylinder shape.
 */
public class Cylinder extends ThreeDimensionalShape {
    /**
     * Constructor for a cylinder object with specified height and base radius.
     *
     * @param height The height of the cylinder.
     * @param radius The radius of the base of the cylinder.
     */
    public Cylinder(double height, double radius) {
        super(height, radius);
    }

    /**
     * Calculate and return the base area of the cylinder.
     *
     * @return The base area of the cylinder.
     */
    @Override
    public double getArea() {
        // Calculate and return only the base area of the cylinder
        return Math.PI * sideLength * sideLength;
    }

    /**
     * Calculate and return the volume of the cylinder.
     *
     * @return The volume of the cylinder.
     */
    @Override
    public double getVolume() {
        // Implement the volume calculation for a cylinder
        return Math.PI * sideLength * sideLength * height;
    }
    
    /**
     * Returns information about the cylinder object as a string.
     *
     * @return A string containing information about the cylinder including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "Cylinder [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
