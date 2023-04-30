package Copilot.MergeSort.T14;

public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] tmp = new int[arr.length];
        mergeSortHelper(arr, tmp, 0, arr.length - 1);
    }

    private void mergeSortHelper(int[] arr, int[] tmp, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortHelper(arr, tmp, start, mid);
        mergeSortHelper(arr, tmp, mid + 1, end);
        merge(arr, tmp, start, mid, end);
    }

    private void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = start;
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                tmp[index++] = arr[left++];
            } else {
                tmp[index++] = arr[right++];
            }
        }
        while (left <= mid) {
            tmp[index++] = arr[left++];
        }
        while (right <= end) {
            tmp[index++] = arr[right++];
        }
        for (int i = start; i <= end; i++) {
            arr[i] = tmp[i];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = new int[] { 4, 2, 7, 1, 3, 6, 9, 8, 5 };
        ms.mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
