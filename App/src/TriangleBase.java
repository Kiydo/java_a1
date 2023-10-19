public class TriangleBase extends ThreeDimensionalShape {
    public double sideLength;

    public TriangleBase(double sideLength, double height) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (sideLength * sideLength) * (Math.sqrt(3) / 4);
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }
    
}
