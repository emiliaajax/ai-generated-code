package ChatGPT.MergeSort.T14;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      mergeSort(arr, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = start + (end - start) / 2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, start, mid, end);
  }
  
  private void merge(int[] arr, int start, int mid, int end) {
      int[] temp = new int[arr.length];
      for (int i = start; i <= end; i++) {
          temp[i] = arr[i];
      }
      int left = start;
      int right = mid + 1;
      int index = start;
      while (left <= mid && right <= end) {
          if (temp[left] <= temp[right]) {
              arr[index++] = temp[left++];
          } else {
              arr[index++] = temp[right++];
          }
      }
      while (left <= mid) {
          arr[index++] = temp[left++];
      }
      while (right <= end) {
          arr[index++] = temp[right++];
      }
  }
}
