package Copilot.QuickSort.T13;

public class QuickSort {
    public void sort(int[] array) {
        // Check for empty or null array
        if (array == null || array.length == 0) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = array[low + (high - low) / 2];
        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (array[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (array[j] > pivot) {
                j--;
            }
            // If we have found a value in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(array, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quickSort(array, low, j);
        if (i < high)
            quickSort(array, i, high);
    }

    private void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
