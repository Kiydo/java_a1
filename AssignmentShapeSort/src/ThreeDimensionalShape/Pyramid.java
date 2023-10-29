package ThreeDimensionalShape;

public class Pyramid extends ThreeDimensionalShape {
    /**
     * Constructor for a pyramid object with specified height and base length.
     *
     * @param height The height of the pyramid.
     * @param baseLength The length of the base of the pyramid.
     */
    public Pyramid(double height, double baseLength) {
        super(height, baseLength);
    }

    /**
     * Calculate and return the base area of the pyramid.
     */
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    /**
     * Calculate and return the volume of the pyramid.
     */
    @Override
    public double getVolume() {
        return (1.0 / 3) * sideLength * sideLength * height;
    }
    
    /**
     * Returns information about the pyramid object as a string.
     *
     * @return A string containing information about the pyramid including it's height, base area, and volume.
     */
    @Override
    public String toString() {
    return "Pyramid [Height=" + height + ", BaseArea=" + getArea() + ", Volume=" + getVolume() + "]";
    }
}
