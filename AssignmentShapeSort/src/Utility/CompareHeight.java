package Utility;

import java.util.Comparator;

import ThreeDimensionalShape.ThreeDimensionalShape;

public class CompareHeight implements Comparator<ThreeDimensionalShape>{
    @Override
    public int compare(ThreeDimensionalShape o1, ThreeDimensionalShape o2) {
        if (o1.height > o2.height) {
            return -1;
        } else if (o1.height < o2.height) {
            return 1;
        } else {
            return 0;
        }
    }
}
