package ThreeDimensionalShape;


/**
 * A class representing a three-dimensional pentagonal prism shape.
 * 
 * @author Team2
 */
public class PentagonalPrism extends ThreeDimensionalShape {
	
    /**
     * Constructor for a pentagonal prism object with specified height and side length.
     *
     * @param height The height of the pentagonal prism.
     * @param sideLength The side length of the base of the pentagonal prism.
     */
    public PentagonalPrism(double height, double sideLength) {
        super(height, sideLength);
    }

    /**
     * Calculate and return the base area of the pentagonal prism.
     */
    @Override
    public double getArea() {
        double degrees = 54;
        return 5 * (sideLength * sideLength) * (Math.tan(Math.toRadians(degrees)) / 4);
    }

    /**
     * Calculate and return the volume of the pentagonal prism.
     */
    @Override
    public double getVolume() {
        return getArea() * height;
    }
    
    /**
     * Returns information about the pentagonal prism object as a string.
     *
     * @return A string containing information about the pentagonal prism including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "PentagonalPrism [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}