package io.mxhit.algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};

        int[] sortedArray = insertionSort(array);

        Arrays.stream(sortedArray).forEach(i -> System.out.println(i));
    }

    public static int[] insertionSort(int[] array) {
        int j, key;

        for (int i = 1; i < array.length; i++) {
            key = array[i];

            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }

        return array;
    }
}
