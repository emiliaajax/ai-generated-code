package ChatGPT.QuickSort.T28;

public class QuickSort {
  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int low, int high) {
      if (low >= high) {
          return;
      }
      int pivotIndex = partition(arr, low, high);
      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, high);
  }

  private int partition(int[] arr, int low, int high) {
      int pivotValue = arr[high];
      int i = low;
      for (int j = low; j < high; j++) {
          if (arr[j] < pivotValue) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
          }
      }
      int temp = arr[i];
      arr[i] = arr[high];
      arr[high] = temp;
      return i;
  }
}

