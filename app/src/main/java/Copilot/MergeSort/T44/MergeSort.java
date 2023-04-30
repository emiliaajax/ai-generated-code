package Copilot.MergeSort.T44;

public class MergeSort {
    // Merge sort algorithm
    public void mergeSort(int[] array) {
        int[] temp = new int[array.length];
        mergeSort(array, temp, 0, array.length - 1);
    }

    // Merge sort algorithm
    private void mergeSort(int[] array, int[] temp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(array, temp, left, center);
            mergeSort(array, temp, center + 1, right);
            merge(array, temp, left, center + 1, right);
        }
    }

    // Merge algorithm
    private void merge(int[] array, int[] temp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[k++] = array[left++];
            } else {
                temp[k++] = array[right++];
            }
        }

        while (left <= leftEnd) {
            temp[k++] = array[left++];
        }

        while (right <= rightEnd) {
            temp[k++] = array[right++];
        }

        for (int i = 0; i < num; i++, rightEnd--) {
            array[rightEnd] = temp[rightEnd];
        }
    }
}
