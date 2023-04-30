package Copilot.QuickSort.T15;

public class QuickSort {
    // Sort the array using quick sort algorithm.
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // Sort the array from index low to index high using quick sort algorithm.
    private void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = arr[high];
        int i = low;
        int j = high - 1;
        while (i < j) {
            while (i < j && arr[i] < pivot) {
                i++;
            }
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        if (arr[i] >= arr[high]) {
            swap(arr, i, high);
        } else {
            i++;
        }

        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

    // Swap the elements at indices i and j in the array.
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
