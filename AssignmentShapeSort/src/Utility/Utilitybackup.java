/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Arrays;

/**
 *
 * @author pltdu
 */
public class Utilitybackup<T extends Comparable<T>> {
    // public static void selectionSort(int[] array) {
    //     // iterate through the array. -1 to ignore the last element in the array since
    //     // there is no need. It is already in the last position.
    //     for (int i = 0; i < array.length - 1; i++) {
    //         int min = i;
    //         for (int j = i + 1; j < array.length; j++) {
    //             if (array[j] < array[min]) {
    //                 min = j;
    //             }
    //         }
    //         int temp = array[min];
    //         array[min] = array[i];
    //         array[i] = temp;
    //     }
    // }

    public void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    // compare each unsorted element with the 'sorted' part of the array
    // public static void insertionSort(int[] array) {
    //     for (int i = 1; i < array.length; i++) {
    //         int key = array[i];
    //         int j = i - 1;
    //         while (j >= 0 && array[j] > key) {
    //             array[j + 1] = array[j];
    //             j--;
    //         }
    //         array[j + 1] = key;
    //     }
    // }
    public void insertionSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // compare each element with the next element. If its in the wrong order, swap
    // them.
    // public static void bubbleSort(int[] array) {
    //     for (int i = 0; i < array.length - 1; i++) {
    //         for (int j = 0; j < array.length - i - 1; j++) {
    //             if (array[j] > array[j + 1]) {
    //                 int temp = array[j];
    //                 array[j] = array[j + 1];
    //                 array[j + 1] = temp;
    //             }
    //         }
    //     }
    // }
    public void bubbleSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
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
    // public static void quickSort(int[] array, int lowIndex, int highIndex) {
    //     // quickSort(array, 0, array.length - 1);

    //     if (lowIndex >= highIndex) {
    //         return; // exit when arrays only have 1 element
    //     }
    //     // last element in array as pivot
    //     int pivot = array[highIndex];
    //     int lp = lowIndex; // left pointer moving right
    //     int rp = highIndex; // right pointer moving left

    //     while (lp < rp) {
    //         while (array[lp] <= pivot && lp < rp) {
    //             lp++;
    //         }
    //         while (array[rp] >= pivot && lp < rp) {
    //             rp--;
    //         }
    //         swap(array, lp, rp);
    //     }
    //     swap(array, lp, highIndex);

    //     // repeat recursively for left and right subarrays
    //     quickSort(array, lowIndex, lp - 1);
    //     quickSort(array, lp + 1, highIndex);
    // }
    public void quickSort(T[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        T pivot = array[highIndex];
        int lp = lowIndex;
        int rp = highIndex;

        while (lp < rp) {
            while (array[lp].compareTo(pivot) <= 0 && lp < rp) {
                lp++;
            }
            while (array[rp].compareTo(pivot) >= 0 && lp < rp) {
                rp--;
            }
            swap(array, lp, rp);
        }
        swap(array, lp, highIndex);

        quickSort(array, lowIndex, lp - 1);
        quickSort(array, lp + 1, highIndex);
    }

    // swap 2 elements in array using provided indexes
    // public static void swap(int[] array, int index1, int index2) {
    //     int temp = array[index1];
    //     array[index1] = array[index2];
    //     array[index2] = temp;

    // }
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
    // public static void mergeSort(int[] array) {
    //     if (array.length > 1) {
    //         int mid = array.length / 2;
    //         int[] left = new int[mid];
    //         int[] right = new int[array.length - mid];

    //         for (int i = 0; i < mid; i++) {
    //             left[i] = array[i];
    //         }
    //         for (int i = mid; i < array.length; i++) {
    //             right[i - mid] = array[i];
    //         }

    //         // Recursively sort the left and right sub-arrays
    //         mergeSort(left);
    //         mergeSort(right);

    //         // Merge the sorted sub-arrays back into the original array
    //         merge(array, left, right);
    //     }
    // }
    public void mergeSort(T[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            T[] left = Arrays.copyOfRange(array, 0, mid);
            T[] right = Arrays.copyOfRange(array, mid, array.length);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }

    // public static void merge(int[] array, int[] left, int[] right) {
    //     int i = 0, j = 0, k = 0;

    //     while (i < left.length && j < right.length) {
    //         if (left[i] < right[j]) {
    //             array[k++] = left[i++];
    //         } else {
    //             array[k++] = right[j++];
    //         }
    //     }

    //     while (i < left.length) {
    //         array[k++] = left[i++];
    //     }

    //     while (j < right.length) {
    //         array[k++] = right[j++];
    //     }
    // }
    public void merge(T[] array, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
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

    
    // The 2nd method {countSort} to sort the order by given exponential place
    // private static void countSort(int[] array, int exp) {
    //     // output array and buckets array for temp storage
    // 	int[] output = new int[array.length];
    //     int[] buckets = new int[10];

    //     // store "how many times each number existed" in buckets array
    //     for (int i = 0; i < array.length; i++)
    //         buckets[(array[i]/exp) % 10]++;

    //     // update buckets array by accumulating the times for each index with the last index
    //     for (int i = 1; i < 10; i++)
    //         buckets[i] += buckets[i - 1];

    //     // store the result in output array
    //     for (int i = array.length - 1; i >= 0; i--) {
    //         output[buckets[(array[i]/exp) % 10] - 1] = array[i];
    //         buckets[(array[i]/exp) % 10]--;
    //     }

    //     // assign the sorted output back to the original array
    //     for (int i = 0; i < array.length; i++)
    //     	array[i] = output[i];
        
    //     // clear the 2 temp arrays
    //     output = null;
    //     buckets = null;
    // }
    private void countSort(T[] array, int exp) {
        T[] output = Arrays.copyOf(array, array.length);
        int[] buckets = new int[10];

        for (T item : array) {
            int index = Integer.parseInt(item.toString()) / exp % 10;
            buckets[index]++;
        }

        for (int i = 1; i < 10; i++) {
            buckets[i] += buckets[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            int index = Integer.parseInt(array[i].toString()) / exp % 10;
            output[buckets[index] - 1] = array[i];
            buckets[index]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
    
    // Radix Sort - non-comparative. doesn't work with objects.
    // time complexity: O(nk)
    // space complexity: O(n+k)
    // The 1st method {getMax} to get the largest number in the array so that we will know the highest exponential number
    // private static int getMax(int[] array) {
	// 	int max = array[0];

    //     for (int i = 1; i < array.length; i++) {
    //     	if (array[i] > max) {
    //     		max = array[i];
    //     	}   
    //     }
        
    //     return max;
    // }
    // // The final method to utilize {getMax} and {countSort} to sort each exponential digits of the passing array
    // public static void radixSort(int[] array) {
    //     int max = getMax(array);

    //     for (int exp = 1; max/exp > 0; exp *= 10)
    //         countSort(array, exp);
    // }
    public void radixSort(T[] array) {
        int max = getMax(array);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(array, exp);
        }
    }

    private int getMax(T[] array) {
        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return Integer.parseInt(max.toString()); // Convert max to integer for radix sort
    }
	
}
