package ChatGPT.MergeSort.T37;

public class MergeSort {
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      int n = arr.length;
      int[] temp = new int[n];
      mergeSort(arr, 0, n - 1, temp);
  }
  
  private void mergeSort(int[] arr, int left, int right, int[] temp) {
      if (left >= right) {
          return;
      }
      int mid = (left + right) / 2;
      mergeSort(arr, left, mid, temp);
      mergeSort(arr, mid + 1, right, temp);
      merge(arr, left, mid, right, temp);
  }
  
  private void merge(int[] arr, int left, int mid, int right, int[] temp) {
      for (int i = left; i <= right; i++) {
          temp[i] = arr[i];
      }
      int i = left;
      int j = mid + 1;
      int k = left;
      while (i <= mid && j <= right) {
          if (temp[i] <= temp[j]) {
              arr[k++] = temp[i++];
          } else {
              arr[k++] = temp[j++];
          }
      }
      while (i <= mid) {
          arr[k++] = temp[i++];
      }
      while (j <= right) {
          arr[k++] = temp[j++];
      }
  }
}
