public class OctagonBase extends ThreeDimensionalShape {
    public double sideLength;

    public OctagonBase(double sideLength, double height) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * (sideLength * sideLength);
    }

    @Override
    public double getVolume() {
        return getArea() * (height * height * height * height);
    }

    
}
