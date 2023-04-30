package Copilot.QuickSort.T24;

public class QuickSort {
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = partition(a, left, right);
        sort(a, left, pivot - 1);
        sort(a, pivot + 1, right);
    }

    private static int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, right);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
