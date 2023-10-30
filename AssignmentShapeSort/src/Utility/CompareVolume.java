package Utility;

import java.util.Comparator;
import ThreeDimensionalShape.ThreeDimensionalShape;

/**
 * The CompareVolume class is a custom comparator for comparing objects of the ThreeDimensionalShape class based on their volumes.
 * It implements the Comparator interface for ThreeDimensionalShape objects.
 * 
 * @author Team2
 */
public class CompareVolume implements Comparator<ThreeDimensionalShape> {
    
	/**
     * Compares two ThreeDimensionalShape objects based on their volumes.
     *
     * @param o1 The first ThreeDimensionalShape object to compare.
     * @param o2 The second ThreeDimensionalShape object to compare.
     * @return -1 if o1's volume is greater than o2's volume, 1 if o1's volume is less than o2's volume, or 0 if both volumes are equal.
     */
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