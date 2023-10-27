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

public class FileReader {
    public FileReader() {
    }

    private ThreeDimensionalShape[] shapesArray;

    public ThreeDimensionalShape[] getShapesArray() {
        return shapesArray;
    }
    
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
