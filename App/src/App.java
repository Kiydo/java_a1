public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // test sort
        int[] array = { 5, 4, 3, 2, 1, 55, 77, 7, 88, 12, 9 };
        Sorter.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
