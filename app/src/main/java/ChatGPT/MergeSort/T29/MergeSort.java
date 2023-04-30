package ChatGPT.MergeSort.T29;

public class MergeSort {
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length == 0) {
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
      int[] temp = new int[end - start + 1];
      int i = start;
      int j = mid + 1;
      int k = 0;
      while (i <= mid && j <= end) {
          if (arr[i] <= arr[j]) {
              temp[k++] = arr[i++];
          } else {
              temp[k++] = arr[j++];
          }
      }
      while (i <= mid) {
          temp[k++] = arr[i++];
      }
      while (j <= end) {
          temp[k++] = arr[j++];
      }
      for (i = 0; i < temp.length; i++) {
          arr[start + i] = temp[i];
      }
  }
}
