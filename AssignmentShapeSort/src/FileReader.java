import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ThreeDimensionalShape.Cone;
import ThreeDimensionalShape.Cylinder;
import ThreeDimensionalShape.OctagonalPrism;
import ThreeDimensionalShape.PentagonalPrism;
import ThreeDimensionalShape.Pyramid;
import ThreeDimensionalShape.SquarePrism;
import ThreeDimensionalShape.ThreeDimensionalShape;
import ThreeDimensionalShape.TriangularPrism;

/**
 * The FileReader class reads three-dimensional shape data from a file and creates an array of shapes.
 * It can read shape information from a file, create corresponding shape objects, and store them in an array.
 * 
 * @author Team2
 */
public class FileReader {
	
    /**
     * Initializes a new instance of the FileReader class.
     */
    public FileReader() {
    }

    private ThreeDimensionalShape[] shapesArray;

    /**
     * Gets the array of ThreeDimensionalShape objects.
     *
     * @return An array of ThreeDimensionalShape objects.
     */
    public ThreeDimensionalShape[] getShapesArray() {
        return shapesArray;
    }
        
    /**
     * Reads three-dimensional shape data from a file and populates the shapesArray.
     *
     * @param fileName The name of the file to read shape data from.
     */
    public void readShapesFromFile(String fileName) {
        File file = new File(fileName);
    
        try (Scanner myReader = new Scanner(file)) {
            int numObjects = myReader.nextInt();
            System.out.println("There are " + numObjects + " objects in the file.");
            shapesArray = new ThreeDimensionalShape[numObjects];
    
            for (int i = 0; i < numObjects; i++) {
                String objectType = myReader.next();
                double height = myReader.nextDouble();
                double sideLength = myReader.nextDouble();
    
                ThreeDimensionalShape shape = createShape(objectType, height, sideLength);
                shapesArray[i] = shape;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
    
    /**
     * Create a ThreeDimensionalShape object based on the given parameters.
     *
     * @param objectType   The type of the three-dimensional shape (e.g., "cone", "cylinder").
     * @param height       The height of the shape.
     * @param sideLength   The side length of the shape.
     * @return A ThreeDimensionalShape object corresponding to the given parameters.
     * @throws IllegalArgumentException if the objectType is not supported.
     */
    private ThreeDimensionalShape createShape(String objectType, double height, double sideLength) {
        objectType = objectType.toLowerCase(); // Normalize the input
        switch (objectType) {
            case "cone":
                return new Cone(height, sideLength);
            case "cylinder":
                return new Cylinder(height, sideLength);
            case "pyramid":
                return new Pyramid(height, sideLength);
            case "octagonalprism":
                return new OctagonalPrism(height, sideLength);
            case "pentagonalprism":
                return new PentagonalPrism(height, sideLength);
            case "squareprism":
                return new SquarePrism(height, sideLength);
            case "triangularprism":
                return new TriangularPrism(height, sideLength);
            default:
                throw new IllegalArgumentException("Unsupported shape type: " + objectType);
        }
    }
}