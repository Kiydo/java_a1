public class SquarePrism extends ThreeDimensionalShape {
    public double sideLength;

    public SquarePrism(double sideLength, double height) {
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
