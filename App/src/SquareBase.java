public class SquareBase extends ThreeDimensionalShape {
    public double sideLength;

    public SquareBase(double sideLength, double height) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    public double getVolume() {
        return (sideLength * sideLength) * height;
    }
}
