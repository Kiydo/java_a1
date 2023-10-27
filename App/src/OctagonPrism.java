public class OctagonPrism extends ThreeDimensionalShape {
    public double sideLength;

    public OctagonPrism(double sideLength, double height) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * (sideLength * sideLength);
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    
}
