package ChatGPT.MergeSort.T46;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      
      mergeSortHelper(arr, 0, arr.length - 1);
  }
  
  private void mergeSortHelper(int[] arr, int left, int right) {
      if (left < right) {
          int mid = left + (right - left) / 2;
          mergeSortHelper(arr, left, mid);
          mergeSortHelper(arr, mid + 1, right);
          merge(arr, left, mid, right);
      }
  }
  
  private void merge(int[] arr, int left, int mid, int right) {
      int[] temp = new int[right - left + 1];
      int i = left;
      int j = mid + 1;
      int k = 0;
      
      while (i <= mid && j <= right) {
          if (arr[i] < arr[j]) {
              temp[k++] = arr[i++];
          } else {
              temp[k++] = arr[j++];
          }
      }
      
      while (i <= mid) {
          temp[k++] = arr[i++];
      }
      
      while (j <= right) {
          temp[k++] = arr[j++];
      }
      
      for (i = left, k = 0; i <= right; i++, k++) {
          arr[i] = temp[k];
      }
  }
}
