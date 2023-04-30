package ChatGPT.MergeSort.T42;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      mergeSort(arr, 0, arr.length - 1);
  }

  private void mergeSort(int[] arr, int left, int right) {
      if (left >= right) {
          return;
      }
      int mid = left + (right - left) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
  }

  private void merge(int[] arr, int left, int mid, int right) {
      int[] temp = new int[right - left + 1];
      int i = left, j = mid + 1, k = 0;
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
      for (int m = 0; m < temp.length; m++) {
          arr[left + m] = temp[m];
      }
  }
}
