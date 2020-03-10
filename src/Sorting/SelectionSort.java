package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] array) {
        // 6 5 4 3 2 1
        for (int boundaryIndex = 0; boundaryIndex < array.length; boundaryIndex++) {
            int miniIndex = boundaryIndex;
            for (int unsortedIndex = boundaryIndex; unsortedIndex < array.length; unsortedIndex++) {
                // Compare the data at the miniIndex and the data at the unsortedIndex
                if (array[unsortedIndex] < array[miniIndex]) {
                    // Move the miniIndex
                    miniIndex = unsortedIndex;

                }

            }

            // Swap the data at the miniIndex and the data at the boundaryIndex
            int tmp = array[miniIndex];
            array[miniIndex] = array[boundaryIndex];
            array[boundaryIndex] = tmp;

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(selectionSort(array)));

    }

}



