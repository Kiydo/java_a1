package Utility;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The Utility class provides a collection of sorting algorithms and utility methods for sorting arrays of generic types.
 * 
 * @author Team2
 * @param <T> The type of elements in the array.
 */
public class Utility<T> {
	
	/**
     * Sorts the given array using the selection sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
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


    /**
     * Sorts the given array using the insertion sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
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

    /**
     * Sorts the given array using the bubble sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
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

    /**
     * Sorts the given array using the quick sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param lowIndex   The index of the first element in the subarray to be sorted.
     * @param highIndex  The index of the last element in the subarray to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
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

    /**
     * For quick sort algorithm.
     * This method is used when 2 elements in the array are required to be swapped.
     * 
     * @param array  The array to be swapped.
     * @param index1 The index of element 1 to be swapped.
     * @param index2 The index of element 2 to be swapped.
     */
    private void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Sorts the given array using the merge sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
    public void mergeSort(T[] array, Comparator<T> comparator) {
        mergeSort(array, 0, array.length - 1, comparator);
    }
    
    /**
     * For merge sort algorithm.
     * This method is used to call itself recursively to sort the subarray of elements.
     * 
     * @param array
     * @param left
     * @param right
     * @param comparator
     */
    private void mergeSort(T[] array, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid, comparator);
            mergeSort(array, mid + 1, right, comparator);
            merge(array, left, mid, right, comparator);
        }
    }
    
    /**
     * For merge sort algorithm.
     * This method is used to merge 2 subarrays.
     * 
     * @param array      The array containing the subarrays to be merged.
     * @param left       The index of the left boundary of the first subarray.
     * @param mid        The index marking the end of the first subarray and the start of the second subarray.
     * @param right      The index of the right boundary of the second subarray.
     * @param comparator The comparator used to determine the order of elements.
     */
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

    /**
     * Sorts the given array using the radix sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
    public void radixSort(T[] array, Comparator<T> comparator) {
        int max = getMax(array, comparator);
    
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, exp, comparator);
        }
    }
    
    /**
     * For radix sort algorithm.
     * This method is used to perform counting sort on the array for a specific digit position.
     *
     * @param array      The array to be sorted.
     * @param exp        The digit position (e.g., units, tens) to sort based on.
     * @param comparator The comparator used to determine the order of elements.
     */
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
    
    /**
     * For radix sort algorithm.
     * This method is used to return the maximum element in the array based on the comparator.
     *
     * @param array      The array to find the maximum element in.
     * @param comparator The comparator used to determine the order of elements.
     * @return The maximum element in the array.
     */
    private int getMax(T[] array, Comparator<T> comparator) {
        T max = array[0];
    
        for (int i = 1; i < array.length; i++) {
            if (comparator.compare(array[i], max) > 0) {
                max = array[i];
            }
        }
    
        return max != null ? Integer.parseInt(max.toString()) : 0;
    }
    
    /**
     * Sorts the given array using the heap sort algorithm.
     *
     * @param array      The array to be sorted.
     * @param comparator The comparator used to determine the order of elements.
     */
    public void heapSort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }

        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, comparator);
        }

        for (int i = n - 1; i > 0; i--) {
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0, comparator);
        }
    }

    /**
     * For heap sort algorithm.
     * This method is used to heapify a subarray of the given array.
     *
     * @param array      The array to be sorted.
     * @param n          The size of the subarray.
     * @param i          The index of the root node of the subarray.
     * @param comparator The comparator used to determine the order of elements.
     */
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
            T temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest, comparator);
        }
    }
}