package ChatGPT.QuickSort.T3;

public class QuickSort {

  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quicksort(arr, 0, arr.length - 1);
  }

  private void quicksort(int[] arr, int low, int high) {
      if (low < high) {
          int pivotIndex = partition(arr, low, high);
          quicksort(arr, low, pivotIndex - 1);
          quicksort(arr, pivotIndex + 1, high);
      }
  }

  private int partition(int[] arr, int low, int high) {
      int pivot = arr[high];
      int i = low - 1;
      for (int j = low; j <= high - 1; j++) {
          if (arr[j] < pivot) {
              i++;
              swap(arr, i, j);
          }
      }
      swap(arr, i + 1, high);
      return i + 1;
  }

  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}
