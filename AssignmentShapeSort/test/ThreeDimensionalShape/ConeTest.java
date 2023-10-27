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
public class ConeTest {
    
    public ConeTest() {
    }

    /**
     * Test of getArea method, of class Cone.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Cone instance = null;
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Cone.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Cone instance = null;
        double expResult = 0.0;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
