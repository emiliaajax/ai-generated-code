package ChatGPT.MergeSort.T21;

public class MergeSort {

  public void mergeSort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      int[] temp = new int[arr.length];
      mergeSort(arr, 0, arr.length - 1, temp);
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
      for (int k = left; k <= right; k++) {
          if (i > mid) {
              arr[k] = temp[j++];
          } else if (j > right) {
              arr[k] = temp[i++];
          } else if (temp[i] <= temp[j]) {
              arr[k] = temp[i++];
          } else {
              arr[k] = temp[j++];
          }
      }
  }
}
