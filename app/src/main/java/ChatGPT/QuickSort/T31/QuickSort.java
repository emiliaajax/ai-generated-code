package ChatGPT.QuickSort.T31;

public class QuickSort {

  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int left, int right) {
      if (left < right) {
          int pivot = partition(arr, left, right);
          quickSort(arr, left, pivot - 1);
          quickSort(arr, pivot + 1, right);
      }
  }

  private int partition(int[] arr, int left, int right) {
      int pivot = arr[right];
      int i = left - 1;
      for (int j = left; j < right; j++) {
          if (arr[j] < pivot) {
              i++;
              swap(arr, i, j);
          }
      }
      swap(arr, i + 1, right);
      return i + 1;
  }

  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}
