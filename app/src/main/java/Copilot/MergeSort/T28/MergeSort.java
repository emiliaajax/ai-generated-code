package Copilot.MergeSort.T28;

public class MergeSort {
    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int[] leftArr = new int[middle - left + 1];
        int[] rightArr = new int[right - middle];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
