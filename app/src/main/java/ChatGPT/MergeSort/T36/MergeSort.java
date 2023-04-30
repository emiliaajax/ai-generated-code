package ChatGPT.MergeSort.T36;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      mergeSort(arr, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
          int mid = (left + right) / 2;
          mergeSort(arr, left, mid);
          mergeSort(arr, mid + 1, right);
          merge(arr, left, mid, right);
      }
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
          k++;
          i++;
      }
  }
}
