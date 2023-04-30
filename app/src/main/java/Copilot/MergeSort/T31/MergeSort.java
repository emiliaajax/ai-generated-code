package Copilot.MergeSort.T31;

public class MergeSort {
    public void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, helper, low, middle);
            mergeSort(arr, helper, middle + 1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    private void merge(int[] arr, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helperLeft + i];
        }
    }
}
