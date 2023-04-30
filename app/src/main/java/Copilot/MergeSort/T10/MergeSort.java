package Copilot.MergeSort.T10;

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

    private void merge(int[] arr, int[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                tmp[k++] = arr[left++];
            } else {
                tmp[k++] = arr[right++];
            }
        }

        while (left <= leftEnd) {
            tmp[k++] = arr[left++];
        }

        while (right <= rightEnd) {
            tmp[k++] = arr[right++];
        }

        for (int i = 0; i < num; i++, rightEnd--) {
            arr[rightEnd] = tmp[rightEnd];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = { 1, 4, 2, 4, 5, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ms.mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
