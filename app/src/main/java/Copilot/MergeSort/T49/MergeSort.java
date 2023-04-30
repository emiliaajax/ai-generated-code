package Copilot.MergeSort.T49;

public class MergeSort {
    public void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, middle + 1, end);
        }
    }

    private void merge(int[] array, int start1, int end1, int start2, int end2) {
        int[] temp = new int[end2 - start1 + 1];
        int index1 = start1;
        int index2 = start2;
        int index = 0;
        while (index1 <= end1 && index2 <= end2) {
            if (array[index1] <= array[index2]) {
                temp[index++] = array[index1++];
            } else {
                temp[index++] = array[index2++];
            }
        }
        while (index1 <= end1) {
            temp[index++] = array[index1++];
        }
        while (index2 <= end2) {
            temp[index++] = array[index2++];
        }
        for (int i = 0; i < temp.length; i++) {
            array[start1 + i] = temp[i];
        }
    }
}
