package Copilot.MergeSort.T23;

public class MergeSort {
    public void mergeSort(int[] input) {
        if (input == null || input.length == 0) {
            return;
        }
        mergeSort(input, 0, input.length - 1);
    }

    private void mergeSort(int[] input, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(input, left, mid);
        mergeSort(input, mid + 1, right);
        merge(input, left, mid, right);
    }

    private void merge(int[] input, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = input[left + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = input[mid + 1 + i];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int index = left;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                input[index] = leftArray[leftIndex];
                leftIndex++;
            } else {
                input[index] = rightArray[rightIndex];
                rightIndex++;
            }
            index++;
        }
        while (leftIndex < leftArray.length) {
            input[index] = leftArray[leftIndex];
            index++;
            leftIndex++;
        }
        while (rightIndex < rightArray.length) {
            input[index] = rightArray[rightIndex];
            index++;
            rightIndex++;
        }
    }
}
