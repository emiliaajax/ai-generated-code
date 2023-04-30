package Copilot.QuickSort.T10;

public class QuickSort {
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[low];
        while (low < high) {
            while (low < high && a[high] >= pivot)
                high--;
            a[low] = a[high];
            while (low < high && a[low] <= pivot)
                low++;
            a[high] = a[low];
        }
        a[low] = pivot;
        return low;
    }
}
