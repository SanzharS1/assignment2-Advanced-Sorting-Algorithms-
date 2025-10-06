package cli;

import algorithms.HeapSort;
import metrics.PerformanceTracker;

public class BenchmarkRunner {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java BenchmarkRunner <array_size>");
            System.exit(1);
        }

        int n = Integer.parseInt(args[0]);

        int[] arr = generateArray(n);

        long startTime = System.nanoTime();
        HeapSort.heapSort(arr);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        PerformanceTracker.writeToCSV("HeapSort", n, duration, HeapSort.getComparisons(), HeapSort.getSwaps());

        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nExecution time: " + duration + " ns");
        System.out.println("Comparisons: " + HeapSort.getComparisons());
        System.out.println("Swaps: " + HeapSort.getSwaps());

        HeapSort.resetCounters();
    }

    private static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 1000);
        }
        return arr;
    }
}
