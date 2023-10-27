
package Utility;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author pltdu
 */
public class Utility<T> {
    // public static void selectionSort(int[] array) {

    public void selectionSort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], array[min]) < 0) {
                    min = j;
                }
            }
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }


    // compare each unsorted element with the 'sorted' part of the array

    public void insertionSort(T[] array, Comparator<T> comparator) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(key, array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // compare each element with the next element. If its in the wrong order, swap
    // them.

    public void bubbleSort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // 1. pick a pivot
    // 2. move elements left of pivot if lower, right if higher
    // 3. repeat the sort on left+right subarrays until subarrays have only 1 value.

    public void quickSort(T[] array, int lowIndex, int highIndex, Comparator<T> comparator) {
        if (lowIndex >= highIndex) {
            return;
        }
        T pivot = array[highIndex];
        int lp = lowIndex;
        int rp = highIndex;
    
        while (lp < rp) {
            while (comparator.compare(array[lp], pivot) <= 0 && lp < rp) {
                lp++;
            }
            while (comparator.compare(array[rp], pivot) >= 0 && lp < rp) {
                rp--;
            }
            swap(array, lp, rp);
        }
        swap(array, lp, highIndex);
    
        quickSort(array, lowIndex, lp - 1, comparator);
        quickSort(array, lp + 1, highIndex, comparator);
    }

    // swap 2 elements in array using provided indexes

    private void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
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

    public void mergeSort(T[] array, Comparator<T> comparator) {
        mergeSort(array, 0, array.length - 1, comparator);
    }
    
    private void mergeSort(T[] array, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid, comparator);
            mergeSort(array, mid + 1, right, comparator);
            merge(array, left, mid, right, comparator);
        }
    }
    
    private void merge(T[] array, int left, int mid, int right, Comparator<T> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
    
        T[] leftArray = Arrays.copyOfRange(array, left, left + n1);
        T[] rightArray = Arrays.copyOfRange(array, mid + 1, mid + 1 + n2);
    
        int i = 0, j = 0, k = left;
    
        while (i < n1 && j < n2) {
            if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
    
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
    
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    
    // The 2nd method {countSort} to sort the order by given exponential place

    private void countSort(T[] array, int exp, Comparator<T> comparator) {
        T[] output = Arrays.copyOf(array, array.length);
        int[] buckets = new int[10];
    
        for (T item : array) {
            int index = (int) (exp / 10.0 * comparator.compare(item, array[0]));
            buckets[index]++;
        }
    
        for (int i = 1; i < 10; i++) {
            buckets[i] += buckets[i - 1];
        }
    
        for (int i = array.length - 1; i >= 0; i--) {
            int index = (int) (exp / 10.0 * comparator.compare(array[i], array[0]));
            output[buckets[index] - 1] = array[i];
            buckets[index]--;
        }
    
        System.arraycopy(output, 0, array, 0, array.length);
    }
    
    // Radix Sort - non-comparative. doesn't work with objects.

    public void radixSort(T[] array, Comparator<T> comparator) {
        int max = getMax(array, comparator);
    
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, exp, comparator);
        }
    }
    
    private int getMax(T[] array, Comparator<T> comparator) {
        T max = array[0];
    
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], max) > 0) {
                max = array[i];
            }
        }
    
        return max != null ? Integer.parseInt(max.toString()) : 0; // Convert max to integer for radix sort
    }
    
    /**
     * Team's choice sorting methods
     * @param array with generic type
     * @param comparator
     */
   
    public void heapSort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return; // No need to sort.
        }

        int n = array.length;

        // Build a max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, comparator);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0, comparator);
        }
    }

    
    
    private void heapify(T[] array, int n, int i, Comparator<T> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comparator.compare(array[left], array[largest]) > 0) {
            largest = left;
        }

        if (right < n && comparator.compare(array[right], array[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            // Swap array[i] and array[largest]
            T temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest, comparator);
        }
    }
}
