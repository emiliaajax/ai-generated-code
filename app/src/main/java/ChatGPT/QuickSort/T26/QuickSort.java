package ChatGPT.QuickSort.T26;

public class QuickSort {

  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int left, int right) {
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
              swap(arr, i, j);
              i++;
              j--;
          }
      }
      if (left < j) {
          quickSort(arr, left, j);
      }
      if (i < right) {
          quickSort(arr, i, right);
      }
  }

  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}
