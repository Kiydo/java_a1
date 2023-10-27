/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ThreeDimensionalShape;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pltdu
 */
public class ThreeDimensionalShapeTest {
    
    public ThreeDimensionalShapeTest() {
    }

    /**
     * Test of getArea method, of class ThreeDimensionalShape.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        ThreeDimensionalShape instance = null;
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class ThreeDimensionalShape.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        ThreeDimensionalShape instance = null;
        double expResult = 0.0;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class ThreeDimensionalShape.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        ThreeDimensionalShape o = null;
        ThreeDimensionalShape instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ThreeDimensionalShapeImpl extends ThreeDimensionalShape {

        public ThreeDimensionalShapeImpl() {
            super(0.0, 0.0);
        }

        public double getArea() {
            return 0.0;
        }

        public double getVolume() {
            return 0.0;
        }
    }
    
}
