package ChatGPT.MergeSort.T5;

public class MergeSort {
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] helper, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, helper, left, mid);
            mergeSort(arr, helper, mid + 1, right);
            merge(arr, helper, left, mid, right);
        }
    }

    private void merge(int[] arr, int[] helper, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            helper[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (helper[i] <= helper[j]) {
                arr[k] = helper[i];
                i++;
            } else {
                arr[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = helper[i];
            k++;
            i++;
        }
    }
}
