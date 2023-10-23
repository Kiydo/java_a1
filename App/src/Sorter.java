public class Sorter {
    public static void selectionSort(int[] array) {
        // iterate through the array. -1 to ignore the last element in the array since
        // there is no need. It is already in the last position.
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    // compare each unsorted element with the 'sorted' part of the array
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // compare each element with the next element. If its in the wrong order, swap
    // them.
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // 1. pick a pivot
    // 2. move elements left of pivot if lower, right if higher
    // 3. repeat the sort on left+right subarrays until subarrays have only 1 value.
    public static void quickSort(int[] array, int lowIndex, int highIndex) {
        // quickSort(array, 0, array.length - 1);

        if (lowIndex >= highIndex) {
            return; // exit when arrays only have 1 element
        }
        // last element in array as pivot
        int pivot = array[highIndex];
        int lp = lowIndex; // left pointer moving right
        int rp = highIndex; // right pointer moving left

        while (lp < rp) {
            while (array[lp] <= pivot && lp < rp) {
                lp++;
            }
            while (array[rp] >= pivot && lp < rp) {
                rp--;
            }
            swap(array, lp, rp);
        }
        swap(array, lp, highIndex);

        // repeat recursively for left and right subarrays
        quickSort(array, lowIndex, lp - 1);
        quickSort(array, lp + 1, highIndex);
    }

    // swap 2 elements in array using provided indexes
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    // Merge Sort - using recursion
    // time complexity: O(n log n)
    // space complexity: O(2n) //larger storage required because its using more
    // lists
    // start with 2 sorted lists.
    // compare first element of each list against each other.
    // smallest goes to the new list first, then the other one. Repeat as you add
    // everything to a single list

    // step 1: distribute so lists are equal.
    // step 2: sort each list
    // step 3: merge the lists
    // if more than 2 lists (like 4), merge 2 together, the other 2 together, then
    // merge the 2 merged lists together
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }

            // Recursively sort the left and right sub-arrays
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted sub-arrays back into the original array
            merge(array, left, right);
        }
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Radix Sort - non-comparative. doesn't work with objects.
    // time complexity: O(nk)
    // space complexity: O(n+k)
    public static void radixSort() {

    }
}