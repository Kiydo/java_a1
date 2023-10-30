package ThreeDimensionalShape;

/**
 * A class representing a three-dimensional cone shape.
 * 
 * @author Team2
 */
public class Cone extends ThreeDimensionalShape {
	
    /**
     * Constructor for a cone object with specified height and radius.
     *
     * @param height The height of the cone.
     * @param radius The radius of the base of the cone.
     */
    public Cone(double height, double radius) {
        super(height, radius);
    }

    /**
     * Calculate and return the base area of the cone.
     *
     * @return The base area of the cone.
     */
    @Override
    public double getArea() {
        return Math.PI * sideLength * sideLength;
    }

    /**
     * Calculate and return the volume of the cone.
     *
     * @return The volume of the cone.
     */
    @Override
    public double getVolume() {
        return (1.0/3) * Math.PI * sideLength * sideLength * height;
    }
    
    /**
     * Returns information about the cone object as a string.
     *
     * @return A string containing information about the cone including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "Cone [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}