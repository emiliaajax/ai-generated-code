package ChatGPT.MergeSort.T43;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] temp = new int[arr.length];
      mergeSortHelper(arr, temp, 0, arr.length - 1);
  }
  
  private void mergeSortHelper(int[] arr, int[] temp, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = (start + end) / 2;
      mergeSortHelper(arr, temp, start, mid);
      mergeSortHelper(arr, temp, mid + 1, end);
      merge(arr, temp, start, mid, end);
  }
  
  private void merge(int[] arr, int[] temp, int start, int mid, int end) {
      // Copy the elements from arr to temp
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
      // Copy remaining elements from left subarray to arr
      while (i <= mid) {
          arr[k] = temp[i];
          i++;
          k++;
      }
      // Copy remaining elements from right subarray to arr
      while (j <= end) {
          arr[k] = temp[j];
          j++;
          k++;
      }
  }
}
