package ChatGPT.MergeSort.T50;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      mergeSortHelper(arr, 0, arr.length - 1);
  }
  
  private void mergeSortHelper(int[] arr, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = (start + end) / 2;
      mergeSortHelper(arr, start, mid);
      mergeSortHelper(arr, mid + 1, end);
      merge(arr, start, mid, end);
  }
  
  private void merge(int[] arr, int start, int mid, int end) {
      int[] temp = new int[arr.length];
      for (int i = start; i <= end; i++) {
          temp[i] = arr[i];
      }
      int i = start;
      int j = mid + 1;
      int k = start;
      while (i <= mid && j <= end) {
          if (temp[i] <= temp[j]) {
              arr[k] = temp[i];
              i++;
          } else {
              arr[k] = temp[j];
              j++;
          }
          k++;
      }
      while (i <= mid) {
          arr[k] = temp[i];
          i++;
          k++;
      }
      while (j <= end) {
          arr[k] = temp[j];
          j++;
          k++;
      }
  }
}
