import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class FileReader {
    public static void reader(String[] args) {
        if (args.length < 3) {
            System.out.println("Invalid # of arguments.");
        }

        String fileName = "";
        String type = null;
        String sortMethod = null;
        HashMap<String, String> sortMap = new HashMap<>();
        sortMap.put("s", "Selection");
        sortMap.put("i", "Insertion");
        sortMap.put("b", "Bubble");
        sortMap.put("q", "Quick");
        sortMap.put("m", "Merge");
        sortMap.put("r", "Radix");

        
        for (int i=0; i<3; i++) {
            if (args[i].substring(0,2).equalsIgnoreCase("-f"))
                fileName=args[i].substring(2, args[i].length());
            if (args[i].substring(0,2).equalsIgnoreCase("-t"))
                type=args[i].substring(2, args[i].length());
            // Sorting and the Type of Sorts
            if (args[i].substring(0,2).equalsIgnoreCase("-s"))
                sortMethod = sortMap.get(args[i].substring(2).toLowerCase());
            
            
        }
        System.out.println(fileName);
        System.out.println(type);
        System.out.println(sortMethod);
        String sortAlgorithm = sortMap.get(sortMethod);
        System.out.println(sortAlgorithm);
        
        //dont process file in main
        File file = new File(fileName);
        Scanner myReader = null;
        try {
            myReader = new Scanner(file);
            int numObjects = myReader.nextInt();
            System.out.println(numObjects);
        
            for (int i=0; i<numObjects; i++){
                String ObjectType = myReader.next();
                if(ObjectType.equalsIgnoreCase("Cone")) {
                    double height = myReader.nextDouble();
                    double radius = myReader.nextDouble();
                    Cone cone = new Cone(radius, height);
                    System.out.println(cone);
                } else if(ObjectType.equalsIgnoreCase("Cylinder")) {
                    double height = myReader.nextDouble();
                    double radius = myReader.nextDouble();
                    Cylinder cylinder = new Cylinder(radius, height);
                    System.out.println(cylinder);
                } else if(ObjectType.equalsIgnoreCase("Pyramid")) {
                    double height = myReader.nextDouble();
                    double sideLength = myReader.nextDouble();
                    Pyramid pyramid = new Pyramid(sideLength, height);
                    System.out.println(pyramid);
                } else if(ObjectType.equalsIgnoreCase("OctagonPrism")) {
                    double height = myReader.nextDouble();
                    double sideLength = myReader.nextDouble();
                    OctagonPrism octagonPrism = new OctagonPrism(sideLength, height);
                    System.out.println(octagonPrism);
                } else if(ObjectType.equalsIgnoreCase("PentagonPrism")) {
                    double height = myReader.nextDouble();
                    double sideLength = myReader.nextDouble();
                    PentagonPrism pentagonPrism = new PentagonPrism(sideLength, height);
                    System.out.println(pentagonPrism);
                } else if(ObjectType.equalsIgnoreCase("SquarePrism")) {
                    double height = myReader.nextDouble();
                    double sideLength = myReader.nextDouble();
                    SquarePrism squarePrism = new SquarePrism(sideLength, height);
                    System.out.println(squarePrism);
                } else if(ObjectType.equalsIgnoreCase("TrianglePrism")) {
                    // ...
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } finally {
            if (myReader != null) {
                myReader.close();
            }
        }
    }
}
