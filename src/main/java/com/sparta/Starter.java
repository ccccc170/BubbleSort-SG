package com.sparta;

import java.util.Arrays;

public class Starter {
    public static void start () {
        int[] numbers = { 5, 9, 1, 8, 11, 8, 5, 3};
        System.out.println("Array to sort: " + Arrays.toString(numbers));
        int[] sortedNumbers = BubbleSort.sortArrAsc(numbers);
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
    }
}
