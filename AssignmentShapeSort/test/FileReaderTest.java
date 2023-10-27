
import ThreeDimensionalShape.ThreeDimensionalShape;
import ThreeDimensionalShape.Cylinder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pltdu
 */
public class FileReaderTest {
    
    public FileReaderTest() {
    }

    /**
     * Test of getShapesArray method, of class FileReader.
     */
    @Test
    public void testGetShapesArray() {
        System.out.println("getShapesArray");
        FileReader instance = new FileReader();
        ThreeDimensionalShape[] expResult = null;
        ThreeDimensionalShape[] result = instance.getShapesArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readShapesFromFile method, of class FileReader.
     */
    @Test
    public void testReadShapesFromFile() {
        System.out.println("readShapesFromFile");
        String fileName = "C:\\test\\polyfor1";
        FileReader instance = new FileReader();
        instance.readShapesFromFile(fileName);
        var testList = instance.getShapesArray();
        var object = testList[0];
        Cylinder cylinder = new Cylinder(12595.147,650.338);
        assertEquals(cylinder, object);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
