
import java.util.Comparator;
import java.util.HashMap;
import ThreeDimensionalShape.ThreeDimensionalShape;
import Utility.CompareArea;
import Utility.CompareHeight;
import Utility.CompareVolume;
import Utility.Utility;

/**
 *
 * @author pltdu
 */
public class AppDriver {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid # of arguments.");
            return;
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

        try {
            for (int i = 0; i < 3; i++) {
                if (args[i].substring(0, 2).equalsIgnoreCase("-f"))
                    fileName = args[i].substring(2);
                if (args[i].substring(0, 2).equalsIgnoreCase("-t"))
                    type = args[i].substring(2);
                if (args[i].substring(0, 2).equalsIgnoreCase("-s"))
                    sortMethod = args[i].substring(2).toLowerCase();
            }
        } catch (Exception e) {
            System.out.println("Invalid argument. Provide 3 arguments. -f(for file, followed by file name or file path), -t(for type, followed by one character), -s(for sort method, followed by one character).\nType:\n a-Area(base)\n v-Volume\n h-Height\nSort Method:\n s-Selection\n i-Insertion\n b-Bubble\n q-Quick\n m-Merge\n r-Radix ");
            return;
        }
        
        //Display the arguments to user
        System.out.println(fileName);
        System.out.println(type);
        System.out.println(sortMethod);


        //Get the array of shapes from the file
        FileReader fileReader = new FileReader();
        fileReader.readShapesFromFile(fileName);
        ThreeDimensionalShape[] shapesArray = fileReader.getShapesArray();


        //Variables for sorting and timing
        long startTime;
        long endTime;
        Utility<ThreeDimensionalShape> shapeUtility = new Utility<>();
        CompareHeight compareHeight = new CompareHeight();
        CompareArea compareArea = new CompareArea();
        CompareVolume compareVolume = new CompareVolume();
        


        //switch for sortAlgorithm
       Comparator<ThreeDimensionalShape> comparator = null; // Initialize the comparator

        switch (type) {
            case "h":
                System.out.println("Sorting by height");
                comparator = compareHeight;
                break;
            case "a":
                System.out.println("Sorting by base area");
                comparator = compareArea;
                break;
            case "v":
                System.out.println("Sorting by volume");
                comparator = compareVolume;
                break;
            default:
                System.out.println("Invalid sort type.");
                return;
        }

        switch (sortMethod) {
            case "s":
                startTime = System.currentTimeMillis();
                shapeUtility.selectionSort(shapesArray, comparator);
                endTime = System.currentTimeMillis();
                System.out.println("Selection sort took " + (endTime - startTime) + " milliseconds.");
                break;
            case "i":
                startTime = System.currentTimeMillis();
                shapeUtility.insertionSort(shapesArray, comparator);
                endTime = System.currentTimeMillis();
                System.out.println("Insertion sort took " + (endTime - startTime) + " milliseconds.");
                break;
            case "b":
                startTime = System.currentTimeMillis();
                shapeUtility.bubbleSort(shapesArray, comparator);
                endTime = System.currentTimeMillis();
                System.out.println("Bubble sort took " + (endTime - startTime) + " milliseconds.");
                break;
            case "q":
                startTime = System.currentTimeMillis();
                shapeUtility.quickSort(shapesArray, 0, shapesArray.length - 1, comparator);
                endTime = System.currentTimeMillis();
                System.out.println("Quick sort took " + (endTime - startTime) + " milliseconds.");
                break;
            case "m":
                startTime = System.currentTimeMillis();
                shapeUtility.mergeSort(shapesArray, comparator);
                endTime = System.currentTimeMillis();
                System.out.println("Merge sort took " + (endTime - startTime) + " milliseconds.");
                break;
            case "z":
                startTime = System.currentTimeMillis();
                shapeUtility.heapSort(shapesArray,comparator);
                endTime = System.currentTimeMillis();
                System.out.println("Heap sort took " + (endTime - startTime) + " milliseconds.");
                break;
            default:
                System.out.println("Invalid sort method.");
                return;
        }

        //Print the sorted array
        
        for (int i = 999; i <= shapesArray.length; i = i + 1000) {
            System.out.println(shapesArray[i]);
        }
        
        System.out.println("First item:" + shapesArray[0]);
        System.out.println("Last item:" + shapesArray[shapesArray.length - 1]);
    }
}    

