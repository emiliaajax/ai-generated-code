package Copilot.MergeSort.T24;

public class MergeSort {
  // Sort the array a using the merge sort algorithm.
  public void mergeSort(int[] a) {
    int[] tmpArray = new int[a.length];
    mergeSort(a, tmpArray, 0, a.length - 1);
  }

  // Sort the array a using the merge sort algorithm.
  private void mergeSort(int[] a, int[] tmpArray, int left, int right) {
    if (left < right) {
      int center = (left + right) / 2;
      mergeSort(a, tmpArray, left, center);
      mergeSort(a, tmpArray, center + 1, right);
      merge(a, tmpArray, left, center + 1, right);
    }
  }

  // Internal method that merges two sorted halves of a subarray.
  private void merge(int[] a, int[] tmpArray, int leftPos, int rightPos, int rightEnd) {
    int leftEnd = rightPos - 1;
    int tmpPos = leftPos;
    int numElements = rightEnd - leftPos + 1;

    // Main loop
    while (leftPos <= leftEnd && rightPos <= rightEnd) {
      if (a[leftPos] <= a[rightPos]) {
        tmpArray[tmpPos++] = a[leftPos++];
      } else {
        tmpArray[tmpPos++] = a[rightPos++];
      }
    }

    while (leftPos <= leftEnd) {
      tmpArray[tmpPos++] = a[leftPos++];
    }

    while (rightPos <= rightEnd) {
      tmpArray[tmpPos++] = a[rightPos++];
    }

    // Copy tmpArray back
    for (int i = 0; i < numElements; i++, rightEnd--) {
      a[rightEnd] = tmpArray[rightEnd];
    }
  }

  // A test method.
  public static void main(String[] args) {
    int[] a = { 5, 9, 1, 3, 2, 6, 4, 8, 7 };
    MergeSort mergeSort = new MergeSort();
    mergeSort.mergeSort(a);
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
