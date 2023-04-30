package Copilot.MergeSort.T34;

public class MergeSort {
    public void mergeSort(int[] num) {
        if (num.length > 1) {
            int[] left = new int[num.length / 2];
            System.arraycopy(num, 0, left, 0, num.length / 2);
            mergeSort(left);

            int rightLength = num.length - num.length / 2;
            int[] right = new int[rightLength];
            System.arraycopy(num, num.length / 2, right, 0, rightLength);
            mergeSort(right);

            int[] result = merge(left, right);
            System.arraycopy(result, 0, num, 0, result.length);
        }
    }

    private int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];

        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                result[k] = list1[i];
                i++;
            } else {
                result[k] = list2[j];
                j++;
            }
            k++;
        }

        while (i < list1.length) {
            result[k] = list1[i];
            i++;
            k++;
        }

        while (j < list2.length) {
            result[k] = list2[j];
            j++;
            k++;
        }

        return result;
    }
}
