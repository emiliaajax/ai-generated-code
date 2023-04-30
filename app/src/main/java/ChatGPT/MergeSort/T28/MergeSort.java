package ChatGPT.MergeSort.T28;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] temp = new int[arr.length];
      mergeSort(arr, temp, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int[] temp, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = start + (end - start) / 2;
      mergeSort(arr, temp, start, mid);
      mergeSort(arr, temp, mid + 1, end);
      merge(arr, temp, start, mid, end);
  }
  
  private void merge(int[] arr, int[] temp, int start, int mid, int end) {
      for (int i = start; i <= end; i++) {
          temp[i] = arr[i];
      }
      int i = start;
      int j = mid + 1;
      for (int k = start; k <= end; k++) {
          if (i > mid) {
              arr[k] = temp[j];
              j++;
          } else if (j > end) {
              arr[k] = temp[i];
              i++;
          } else if (temp[i] <= temp[j]) {
              arr[k] = temp[i];
              i++;
          } else {
              arr[k] = temp[j];
              j++;
          }
      }
  }
}
