/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Utility;

import ThreeDimensionalShape.ThreeDimensionalShape;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pltdu
 */
public class CompareVolumeTest {
    
    public CompareVolumeTest() {
    }

    /**
     * Test of compare method, of class CompareVolume.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        ThreeDimensionalShape o1 = null;
        ThreeDimensionalShape o2 = null;
        CompareVolume instance = new CompareVolume();
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
