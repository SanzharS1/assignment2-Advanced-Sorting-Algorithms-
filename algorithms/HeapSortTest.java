package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class HeapSortTest {

    @Test
    public void testHeapSort() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {5, 5, 5, 5};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{5, 5, 5, 5}, arr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        HeapSort.heapSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testHeapSortWithArraysSort() {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        int[] expected = arr.clone();
        Arrays.sort(expected);
        HeapSort.heapSort(arr);
        assertArrayEquals(expected, arr);
    }
}
