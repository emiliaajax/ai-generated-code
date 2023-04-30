package ChatGPT.MergeSort.T35;

public class MergeSort {

  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] tmp = new int[arr.length];
      mergeSort(arr, tmp, 0, arr.length - 1);
  }

  private void mergeSort(int[] arr, int[] tmp, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = start + (end - start) / 2;
      mergeSort(arr, tmp, start, mid);
      mergeSort(arr, tmp, mid + 1, end);
      merge(arr, tmp, start, mid, end);
  }

  private void merge(int[] arr, int[] tmp, int start, int mid, int end) {
      for (int i = start; i <= end; i++) {
          tmp[i] = arr[i];
      }
      int i = start, j = mid + 1;
      for (int k = start; k <= end; k++) {
          if (i > mid) {
              arr[k] = tmp[j++];
          } else if (j > end) {
              arr[k] = tmp[i++];
          } else if (tmp[j] < tmp[i]) {
              arr[k] = tmp[j++];
          } else {
              arr[k] = tmp[i++];
          }
      }
  }
}
