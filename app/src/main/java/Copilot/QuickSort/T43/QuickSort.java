package Copilot.QuickSort.T43;

public class QuickSort {
    // Sort the array using quick sort algorithm.
    public void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    // Sort the array using quick sort algorithm.
    private void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = partition(array, start, end);
        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);
    }

    // Partition the array using quick sort algorithm.
    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int left = start;
        int right = end - 1;
        while (left <= right) {
            if (array[left] < pivot) {
                left++;
            } else if (array[right] >= pivot) {
                right--;
            } else {
                swap(array, left++, right--);
            }
        }
        swap(array, left, end);
        return left;
    }

    // Swap the elements at the given indices.
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
