package Utility;

import java.util.Comparator;
import ThreeDimensionalShape.ThreeDimensionalShape;
public class CompareVolume implements Comparator<ThreeDimensionalShape> {
    
    @Override
    public int compare(ThreeDimensionalShape o1, ThreeDimensionalShape o2) {
        if (o1.getVolume() > o2.getVolume()) {
            return -1;
        } else if (o1.getVolume() < o2.getVolume()) {
            return 1;
        } else {
            return 0;
        }
    }
}
