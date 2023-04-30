package Copilot.QuickSort.T41;

public class QuickSort {
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = array[high];
        int left = low;
        int right = high - 1;
        while (left <= right) {
            if (array[left] <= pivot) {
                left++;
            } else if (array[right] > pivot) {
                right--;
            } else {
                swap(array, left++, right--);
            }
        }
        swap(array, left, high);
        quickSort(array, low, left - 1);
        quickSort(array, left + 1, high);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
