package ChatGPT.MergeSort.T30;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      
      int[] temp = new int[arr.length];
      mergeSort(arr, 0, arr.length - 1, temp);
  }
  
  private void mergeSort(int[] arr, int left, int right, int[] temp) {
      if (left < right) {
          int mid = (left + right) / 2;
          mergeSort(arr, left, mid, temp);
          mergeSort(arr, mid + 1, right, temp);
          merge(arr, left, mid, right, temp);
      }
  }
  
  private void merge(int[] arr, int left, int mid, int right, int[] temp) {
      int i = left;
      int j = mid + 1;
      int k = 0;
      
      while (i <= mid && j <= right) {
          if (arr[i] <= arr[j]) {
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
