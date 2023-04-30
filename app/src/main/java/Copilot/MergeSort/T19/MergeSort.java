package Copilot.MergeSort.T19;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(arr, temp, left, center);
            mergeSort(arr, temp, center + 1, right);
            merge(arr, temp, left, center + 1, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int right, int rightEnd) {
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
