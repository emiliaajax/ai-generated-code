package Copilot.QuickSort.T44;

public class QuickSort {
    // Implement a non-static quick sort algorithm method named sort with a private
    // void quicksort(int[], int, int) method.
    public void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    // Implement a non-static quick sort algorithm method named quicksort with a
    // public void sort(int[]) method.
    private void quicksort(int[] arr, int low, int high) {
        // If the low index is less than the high index.
        if (low < high) {
            // Set the pivot index to the partition method.
            int pivot = partition(arr, low, high);
            // Recursively call the quicksort method.
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    // Implement a non-static partition algorithm method named partition with a
    // public void sort(int[]) method.
    private int partition(int[] arr, int low, int high) {
        // Set the pivot to the high index.
        int pivot = arr[high];
        // Set the low index to the low index.
        int i = low - 1;
        // For each index in the array.
        for (int j = low; j < high; j++) {
            // If the index value is less than the pivot.
            if (arr[j] < pivot) {
                // Increment the low index.
                i++;
                // Swap the low index value with the index value.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the low index value with the high index value.
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Return the low index.
        return i + 1;
    }
}
