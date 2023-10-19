public abstract class ThreeDimensionalShape implements Comparable<ThreeDimensionalShape>{
    public double height;

    public abstract double getArea();

    public abstract double getVolume();

    public ThreeDimensionalShape(double height) {
        this.height = height;
    }

    @Override
    public int compareTo(ThreeDimensionalShape other) {
        return Double.compare(this.height, other.height);
    }
}



