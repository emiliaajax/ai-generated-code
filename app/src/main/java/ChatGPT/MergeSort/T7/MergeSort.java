package ChatGPT.MergeSort.T7;

public class MergeSort {
  
  public void mergeSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return;
    }
    int[] temp = new int[arr.length];
    mergeSortHelper(arr, temp, 0, arr.length - 1);
  }
  
  private void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
    if (left >= right) {
      return;
    }
    int mid = left + (right - left) / 2;
    mergeSortHelper(arr, temp, left, mid);
    mergeSortHelper(arr, temp, mid + 1, right);
    merge(arr, temp, left, mid, right);
  }
  
  private void merge(int[] arr, int[] temp, int left, int mid, int right) {
    for (int i = left; i <= right; i++) {
      temp[i] = arr[i];
    }
    int i = left;
    int j = mid + 1;
    for (int k = left; k <= right; k++) {
      if (i > mid) {
        arr[k] = temp[j];
        j++;
      } else if (j > right) {
        arr[k] = temp[i];
        i++;
      } else if (temp[i] <= temp[j]) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = temp[j];
        j++;
      }
    }
  }
}
