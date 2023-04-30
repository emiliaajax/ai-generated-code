package ChatGPT.MergeSort.T32;

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
      int mid = start + (end - start) / 2;
      mergeSortHelper(arr, temp, start, mid);
      mergeSortHelper(arr, temp, mid + 1, end);
      merge(arr, temp, start, mid, end);
  }

  private void merge(int[] arr, int[] temp, int start, int mid, int end) {
      int left = start;
      int right = mid + 1;
      int index = start;
      while (left <= mid && right <= end) {
          if (arr[left] <= arr[right]) {
              temp[index++] = arr[left++];
          } else {
              temp[index++] = arr[right++];
          }
      }
      while (left <= mid) {
          temp[index++] = arr[left++];
      }
      while (right <= end) {
          temp[index++] = arr[right++];
      }
      for (int i = start; i <= end; i++) {
          arr[i] = temp[i];
      }
  }
}
