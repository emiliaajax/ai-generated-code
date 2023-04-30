package Copilot.MergeSort.T27;

public class MergeSort {
    public void mergeSort(int[] a) {
        int[] tmp = new int[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
    }

    private void mergeSort(int[] a, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    private void merge(int[] a, int[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int tmpPos = left;
        int numElements = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (a[left] <= a[right]) {
                tmp[tmpPos++] = a[left++];
            } else {
                tmp[tmpPos++] = a[right++];
            }
        }

        while (left <= leftEnd) {
            tmp[tmpPos++] = a[left++];
        }

        while (right <= rightEnd) {
            tmp[tmpPos++] = a[right++];
        }

        for (int i = 0; i < numElements; i++, rightEnd--) {
            a[rightEnd] = tmp[rightEnd];
        }
    }
}
