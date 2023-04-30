package Copilot.QuickSort.T30;

public class QuickSort {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivot = arr[(low + high) / 2];
        int index = partition(arr, low, high, pivot);
        quickSort(arr, low, index - 1);
        quickSort(arr, index, high);
    }

    private int partition(int[] arr, int low, int high, int pivot) {
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }

            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }

        return low;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
