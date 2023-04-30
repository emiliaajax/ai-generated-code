package Copilot.MergeSort.T18;

public class MergeSort {
    public void mergeSort(int[] array) {
        if (array.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[array.length / 2];
            System.arraycopy(array, 0, firstHalf, 0, array.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = array.length - array.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(array, array.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into array
            int current1 = 0; // Current index in firstHalf
            int current2 = 0; // Current index in secondHalf
            int current3 = 0; // Current index in array
            while (current1 < firstHalf.length && current2 < secondHalf.length) {
                if (firstHalf[current1] < secondHalf[current2])
                    array[current3++] = firstHalf[current1++];
                else
                    array[current3++] = secondHalf[current2++];
            }

            while (current1 < firstHalf.length)
                array[current3++] = firstHalf[current1++];

            while (current2 < secondHalf.length)
                array[current3++] = secondHalf[current2++];
        }
    }
}
