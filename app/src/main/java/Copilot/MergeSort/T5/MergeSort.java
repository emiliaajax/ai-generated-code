package Copilot.MergeSort.T5;

public class MergeSort {
  public void mergeSort(int[] a) {
    mergeSort(a, 0, a.length - 1);
  }

  private void mergeSort(int[] a, int start, int end) {
    if (start < end) {
      int mid = (start + end) / 2;
      mergeSort(a, start, mid);
      mergeSort(a, mid + 1, end);
      merge(a, start, mid, end);
    }
  }

  private void merge(int[] a, int start, int mid, int end) {
    int[] temp = new int[end - start + 1];
    int i = start, j = mid + 1, k = 0;
    while (i <= mid && j <= end) {
      if (a[i] < a[j]) {
        temp[k++] = a[i++];
      } else {
        temp[k++] = a[j++];
      }
    }
    while (i <= mid) {
      temp[k++] = a[i++];
    }
    while (j <= end) {
      temp[k++] = a[j++];
    }
    for (int p = 0; p < temp.length; p++) {
      a[start + p] = temp[p];
    }
  }
}
