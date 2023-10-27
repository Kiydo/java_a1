
package ThreeDimensionalShape;

/**
 *
 * @author pltdu
 */
public abstract class ThreeDimensionalShape implements Comparable<ThreeDimensionalShape>{
    public double sideLength;
    public double height;

    public ThreeDimensionalShape(double height, double sideLength) {
        
        this.height = height;
        this.sideLength = sideLength;
    }

    public abstract double getArea();
    public abstract double getVolume();


    @Override
    public int compareTo(ThreeDimensionalShape o) {
        if (this.height > o.height) {
            return -1;
        } else if (this.height < o.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
