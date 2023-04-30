package Copilot.QuickSort.T50;

public class QuickSort {
    public void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] a, int lo, int hi) {
        if (lo >= hi)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];
        while (true) {
            while (a[++i] < v)
                if (i == hi)
                    break;
            while (v < a[--j])
                if (j == lo)
                    break;
            if (i >= j)
                break;
            exchange(a, i, j);
        }
        exchange(a, lo, j);
        return j;
    }

    private void exchange(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
