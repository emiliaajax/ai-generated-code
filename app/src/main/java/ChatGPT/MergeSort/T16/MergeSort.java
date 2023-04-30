package ChatGPT.MergeSort.T16;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] temp = new int[arr.length];
      mergeSort(arr, temp, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int[] temp, int left, int right) {
      if (left < right) {
          int mid = left + (right - left) / 2;
          mergeSort(arr, temp, left, mid);
          mergeSort(arr, temp, mid + 1, right);
          merge(arr, temp, left, mid, right);
      }
  }
  
  private void merge(int[] arr, int[] temp, int left, int mid, int right) {
      for (int i = left; i <= right; i++) {
          temp[i] = arr[i];
      }
      int i = left;
      int j = mid + 1;
      int k = left;
      while (i <= mid && j <= right) {
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
  }
}
