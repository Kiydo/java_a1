package Utility;

import java.util.Comparator;

import ThreeDimensionalShape.ThreeDimensionalShape;

/**
 * The CompareArea class is a custom comparator for comparing objects of the ThreeDimensionalShape class based on their surface areas.
 * It implements the Comparator interface for ThreeDimensionalShape objects.
 * 
 * @author Team2
 */
public class CompareArea implements Comparator<ThreeDimensionalShape>   {
    
	/**
     * Compares two ThreeDimensionalShape objects based on their surface areas.
     *
     * @param o1 The first ThreeDimensionalShape object to compare.
     * @param o2 The second ThreeDimensionalShape object to compare.
     * @return -1 if o1's surface area is greater than o2's surface area, 1 if o1's surface area is less than o2's surface area, or 0 if both surface areas are equal.
     */
    @Override
    public int compare(ThreeDimensionalShape o1, ThreeDimensionalShape o2) {
        if (o1.getArea() > o2.getArea()) {
            return -1;
        } else if (o1.getArea() < o2.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}