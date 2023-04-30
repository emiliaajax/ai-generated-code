package Copilot.QuickSort.T49;

public class QuickSort {
    public void sort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(a, low, high);
        quickSort(a, low, pivot - 1);
        quickSort(a, pivot + 1, high);
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < j && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                a[i++] = a[j];
            }
            while (i < j && a[i] < pivot) {
                i++;
            }
            if (i < j) {
                a[j--] = a[i];
            }
        }
        a[i] = pivot;
        return i;
    }
}
