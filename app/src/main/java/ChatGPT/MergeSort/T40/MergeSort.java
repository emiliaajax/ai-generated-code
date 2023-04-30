package ChatGPT.MergeSort.T40;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      mergeSortHelper(arr, 0, arr.length - 1);
  }
  
  private void mergeSortHelper(int[] arr, int left, int right) {
      if (left >= right) {
          return;
      }
      int mid = (left + right) / 2;
      mergeSortHelper(arr, left, mid);
      mergeSortHelper(arr, mid + 1, right);
      merge(arr, left, mid, right);
  }
  
  private void merge(int[] arr, int left, int mid, int right) {
      int[] temp = new int[arr.length];
      for (int i = left; i <= right; i++) {
          temp[i] = arr[i];
      }
      int i = left;
      int j = mid + 1;
      int k = left;
      while (i <= mid && j <= right) {
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
