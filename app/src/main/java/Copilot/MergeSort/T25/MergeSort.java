package Copilot.MergeSort.T25;

public class MergeSort {
  // This method will sort an array of integers in ascending order using the merge
  // sort algorithm.
  public void mergeSort(int[] a) {
    if (a.length > 1) {
      int[] left = leftHalf(a);
      int[] right = rightHalf(a);

      mergeSort(left);
      mergeSort(right);

      merge(a, left, right);
    }
  }

  // This method will merge two sorted arrays into one sorted array.
  private void merge(int[] result, int[] left, int[] right) {
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

  // This method will return the left half of the original array.
  private int[] leftHalf(int[] array) {
    int size1 = array.length / 2;
    int[] left = new int[size1];
    for (int i = 0; i < size1; i++) {
      left[i] = array[i];
    }
    return left;
  }

  // This method will return the right half of the original array.
  private int[] rightHalf(int[] array) {
    int size1 = array.length / 2;
    int size2 = array.length - size1;
    int[] right = new int[size2];
    for (int i = 0; i < size2; i++) {
      right[i] = array[i + size1];
    }
    return right;
  }
}
