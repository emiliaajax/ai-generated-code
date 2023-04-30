package Copilot.MergeSort.T21;

public class MergeSort {
    public void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid + 1, right);
        }
    }

    private void merge(int[] arr, int[] temp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;
        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= leftEnd) {
            temp[k++] = arr[left++];
        }
        while (right <= rightEnd) {
            temp[k++] = arr[right++];
        }
        for (int i = 0; i < num; i++, rightEnd--) {
            arr[rightEnd] = temp[rightEnd];
        }
    }
}
