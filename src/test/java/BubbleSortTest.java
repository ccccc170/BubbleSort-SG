import com.sparta.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    @DisplayName("Function returns an empty array when passed an empty array")
    public void returnsEmptyArrayWhenPassedEmptyArray () {
        int[] arr = new int[0];
        int[] expectedArr = new int[0];
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns array with the same one element when passed an array with one element")
    public void returnsArrayWithSameOneElementWhenPassedArrayWithOneElement () {
        int[] arr = { 3 };
        int[] expectedArr = { 3 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array with two elements in correct order")
    public void returnsSortedArrayWhenPassedArrayWithTwoElementsInCorrectOrder () {
        int[] arr = { 3, 8 };
        int[] expectedArr = { 3, 8 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array with two elements in incorrect order")
    public void returnsSortedArrayWhenPassedArrayWithTwoElementsInIncorrectOrder () {
        int[] arr = { 7, 3 };
        int[] expectedArr = { 3, 7 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array with more than two elements in correct order")
    public void returnsSortedArrayWhenPassedArrayWithMoreThanTwoElementsInCorrectOrder () {
        int[] arr = { 1, 5, 6, 9, 11 };
        int[] expectedArr = { 1, 5, 6, 9, 11 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array with more than two elements in incorrect order")
    public void returnsSortedArrayWhenPassedArrayWithMoreThanTwoElementsInInCorrectOrder () {
        int[] arr = { 17, 5, 14, 8, 1, 3, 9 };
        int[] expectedArr = { 1, 3, 5, 8, 9, 14, 17 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array containing multiple elements of the same value")
    public void returnsSortedArrayWhenPassedArrayWithMultipleElementsOfTheSameValue () {
        int[] arr = { 9, 7, 5, 9, 7, 1, 3 };
        int[] expectedArr = { 1, 3, 5, 7, 7, 9, 9 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array containing values of zero")
    public void returnsSortedArrayWhenPassedArrayWithValuesOfZero () {
        int[] arr = { 1, 0, 2, 8, 0, 9, 5 };
        int[] expectedArr = { 0, 0, 1, 2, 5, 8, 9 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }

    @Test
    @DisplayName("Function returns sorted array when passed an array containing minus values")
    public void returnsSortedArrayWhenPassedArrayWithVMinusValues () {
        int[] arr = { 5, -6, 2, 5, -8, 11, 4 };
        int[] expectedArr = { -8, -6, 2, 4, 5, 5, 11 };
        int[] result = BubbleSort.sortArrAsc(arr);
        assertArrayEquals(expectedArr, result);
    }
}
