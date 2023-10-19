public class Pyramid extends ThreeDimensionalShape {
    private double sideLength;
    
    public Pyramid(double sideLength, double height) {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        return (1.0/3.0) * (sideLength * sideLength) * height;
    }
}
