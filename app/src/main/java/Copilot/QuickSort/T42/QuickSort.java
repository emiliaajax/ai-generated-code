package Copilot.QuickSort.T42;

public class QuickSort {
    private int[] array;

    public QuickSort() {
    }

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort(int[] array) {
        this.array = array;
        sort(0, array.length - 1);
    }

    private void sort(int start, int end) {
        if (start < end) {
            int pivot = partition(start, end);
            sort(start, pivot - 1);
            sort(pivot + 1, end);
        }
    }

    private int partition(int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end + 1;
        while (true) {
            while (array[++i] < pivot) {
                if (i == end) {
                    break;
                }
            }
            while (array[--j] > pivot) {
                if (j == start) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(i, j);
        }
        swap(start, j);
        return j;
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

