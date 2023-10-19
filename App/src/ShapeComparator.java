import java.util.Comparator;

public class ShapeComparator implements Comparator<ThreeDimensionalShape> {
    public char compareType;

    public ShapeComparator(char compareType) {
        this.compareType = compareType;
    }

    @Override
    public int compare(ThreeDimensionalShape shape1, ThreeDimensionalShape shape2) {
        switch(compareType) {
            case 'a':
                return Double.compare(shape1.getArea(), shape2.getArea());
            case 'v':
                return Double.compare(shape1.getVolume(), shape2.getVolume());
            default:
                throw new IllegalArgumentException("Invalid compare type");
        }
    }
}
