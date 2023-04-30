package Copilot.MergeSort.T42;

public class MergeSort {
    public void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            merge(arr, temp, left, mid, right);
        }
    }

    public void merge(int[] arr, int[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (temp[i] > temp[j]) {
                arr[k++] = temp[j++];
            } else {
                arr[k++] = temp[i++];
            }
        }

        while (i <= mid) {
            arr[k++] = temp[i++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 9, 7, 6, 8, 4 };
        MergeSort msort = new MergeSort();
        msort.mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
