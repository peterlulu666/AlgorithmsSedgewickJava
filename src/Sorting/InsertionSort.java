package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static int[] insertionSort(int[] array) {
        for (int boundaryIndex = 1; boundaryIndex < array.length; boundaryIndex++) {
            int tmp = array[boundaryIndex];
            int sortedIndex = boundaryIndex;
            while (sortedIndex >= 1) {
                if (tmp < array[sortedIndex - 1]) {
                    // Shift
                    array[sortedIndex] = array[sortedIndex - 1];
                    // Replace
                    array[sortedIndex - 1] = tmp;

                }

                // Decrement the sortedIndex
                sortedIndex--;

            }

        }

        return array;

    }

    public static void main(String[] args) {
        int[] array = {6, 5, 4, 2, 3, 1};
        System.out.println(Arrays.toString(insertionSort(array)));

    }

}



