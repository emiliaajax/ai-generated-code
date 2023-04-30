package ChatGPT.MergeSort.T41;

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
      for (int i = start; i <= end; i++) {
          if (left > mid) {
              arr[i] = temp[right++];
          } else if (right > end) {
              arr[i] = temp[left++];
          } else if (temp[left] <= temp[right]) {
              arr[i] = temp[left++];
          } else {
              arr[i] = temp[right++];
          }
      }
  }
}

