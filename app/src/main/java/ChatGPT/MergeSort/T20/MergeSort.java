package ChatGPT.MergeSort.T20;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] tmp = new int[arr.length];
      mergeSortHelper(arr, 0, arr.length - 1, tmp);
  }
  
  private void mergeSortHelper(int[] arr, int left, int right, int[] tmp) {
      if (left >= right) {
          return;
      }
      int mid = left + (right - left) / 2;
      mergeSortHelper(arr, left, mid, tmp);
      mergeSortHelper(arr, mid + 1, right, tmp);
      merge(arr, left, mid, right, tmp);
  }
  
  private void merge(int[] arr, int left, int mid, int right, int[] tmp) {
      int i = left;
      int j = mid + 1;
      int k = 0;
      while (i <= mid && j <= right) {
          if (arr[i] < arr[j]) {
              tmp[k++] = arr[i++];
          } else {
              tmp[k++] = arr[j++];
          }
      }
      while (i <= mid) {
          tmp[k++] = arr[i++];
      }
      while (j <= right) {
          tmp[k++] = arr[j++];
      }
      System.arraycopy(tmp, 0, arr, left, k);
  }
}
