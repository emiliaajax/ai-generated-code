package Copilot.MergeSort.T4;

import java.util.Arrays;

public class MergeSort {
  public void mergeSort(int[] array) {
    mergeSort(array, 0, array.length - 1);
  }

  private void mergeSort(int[] array, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;
    mergeSort(array, start, mid);
    mergeSort(array, mid + 1, end);
    merge(array, start, mid, end);
  }

  private void merge(int[] array, int start, int mid, int end) {
    int[] left = Arrays.copyOfRange(array, start, mid + 1);
    int[] right = Arrays.copyOfRange(array, mid + 1, end + 1);

    int i = 0;
    int j = 0;
    int k = start;
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        array[k++] = left[i++];
      } else {
        array[k++] = right[j++];
      }
    }

    while (i < left.length) {
      array[k++] = left[i++];
    }

    while (j < right.length) {
      array[k++] = right[j++];
    }
  }
}