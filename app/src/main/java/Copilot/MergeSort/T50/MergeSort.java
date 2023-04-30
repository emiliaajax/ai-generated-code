package Copilot.MergeSort.T50;

public class MergeSort {
    public void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(arr, tmp, left, center);
            mergeSort(arr, tmp, center + 1, right);
            merge(arr, tmp, left, center + 1, right);
        }
    }

    private void merge(int[] arr, int[] tmp, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;

        // Main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] <= arr[rightPos]) {
                tmp[tmpPos++] = arr[leftPos++];
            } else {
                tmp[tmpPos++] = arr[rightPos++];
            }
        }

        while (leftPos <= leftEnd) {
            tmp[tmpPos++] = arr[leftPos++];
        }

        while (rightPos <= rightEnd) {
            tmp[tmpPos++] = arr[rightPos++];
        }

        // Copy tmp back
        for (int i = 0; i < numElements; i++, rightEnd--) {
            arr[rightEnd] = tmp[rightEnd];
        }
    }
}
