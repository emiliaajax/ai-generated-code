package ChatGPT.MergeSort.T26;

public class MergeSort {
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      sort(arr, 0, arr.length - 1);
  }

  private void sort(int[] arr, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = start + (end - start) / 2;
      sort(arr, start, mid);
      sort(arr, mid + 1, end);
      merge(arr, start, mid, end);
  }

  private void merge(int[] arr, int start, int mid, int end) {
      int[] temp = new int[arr.length];
      for (int i = start; i <= end; i++) {
          temp[i] = arr[i];
      }
      int i = start, j = mid + 1, k = start;
      while (i <= mid && j <= end) {
          if (temp[i] <= temp[j]) {
              arr[k++] = temp[i++];
          } else {
              arr[k++] = temp[j++];
          }
      }
      while (i <= mid) {
          arr[k++] = temp[i++];
      }
  }
}
