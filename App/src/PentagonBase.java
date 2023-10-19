public class PentagonBase extends ThreeDimensionalShape {
    public double sideLength;

    public PentagonBase(double sideLength, double height) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        double degrees = 54;
        return 5 * (sideLength * sideLength) * (Math.tan(Math.toRadians(degrees)) / 4);
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }
    
}
