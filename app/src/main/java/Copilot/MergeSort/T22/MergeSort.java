package Copilot.MergeSort.T22;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int[] left = leftHalf(arr);
            int[] right = rightHalf(arr);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }
    }

    public static int[] leftHalf(int[] arr) {
        int size1 = arr.length / 2;
        int[] left = new int[size1];
        System.arraycopy(arr, 0, left, 0, size1);
        return left;
    }

    public static int[] rightHalf(int[] arr) {
        int size1 = arr.length / 2;
        int size2 = arr.length - size1;
        int[] right = new int[size2];
        System.arraycopy(arr, size1, right, 0, size2);
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}
