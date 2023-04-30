package ChatGPT.QuickSort.T39;

public class QuickSort {

  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int left, int right) {
      if (left >= right) {
          return;
      }
      int pivot = arr[(left + right) / 2];
      int i = left;
      int j = right;
      while (i <= j) {
          while (arr[i] < pivot) {
              i++;
          }
          while (arr[j] > pivot) {
              j--;
          }
          if (i <= j) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;
          }
      }
      if (left < j) {
          quickSort(arr, left, j);
      }
      if (right > i) {
          quickSort(arr, i, right);
      }
  }
}
