package Utility;

import java.util.Comparator;

import ThreeDimensionalShape.ThreeDimensionalShape;

/**
 * The CompareHeight class is a custom comparator for comparing objects of the ThreeDimensionalShape class based on their heights.
 * It implements the Comparator interface for ThreeDimensionalShape objects.
 * 
 * @author Team2
 */
public class CompareHeight implements Comparator<ThreeDimensionalShape>{
	
	/**
     * Compares two ThreeDimensionalShape objects based on their heights.
     *
     * @param o1 The first ThreeDimensionalShape object to compare.
     * @param o2 The second ThreeDimensionalShape object to compare.
     * @return -1 if o1's height is greater than o2's height, 1 if o1's height is less than o2's height, or 0 if both heights are equal.
     */
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