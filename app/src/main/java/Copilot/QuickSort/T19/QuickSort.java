package Copilot.QuickSort.T19;

public class QuickSort {
public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pivot = partition(a, left, right);
            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
    }

    private int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, right);
        return i + 1;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
