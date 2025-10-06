package algorithms;

public class HeapSort {
    private static int comparisons = 0;
    private static int swaps = 0;

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            swaps++;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        comparisons++;

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        comparisons++;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            swaps++;

            heapify(arr, n, largest);
        }
    }

    public static int getComparisons() {
        return comparisons;
    }

    public static int getSwaps() {
        return swaps;
    }

    public static void resetCounters() {
        comparisons = 0;
        swaps = 0;
    }
}
