package Copilot.MergeSort.T43;

public class MergeSort {
    // Merge sort method
    public void mergeSort(int[] arr) {
        if (arr.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[arr.length / 2];
            System.arraycopy(arr, 0, firstHalf, 0, arr.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = arr.length - arr.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(arr, arr.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into arr
            merge(firstHalf, secondHalf, arr);
        }
    }

    // Merge two sorted lists
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
}
