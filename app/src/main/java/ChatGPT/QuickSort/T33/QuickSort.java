package ChatGPT.QuickSort.T33;

public class QuickSort {
    
  public void sort(int[] arr) {
      quickSort(arr, 0, arr.length - 1);
  }
  
  private void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          int pivotIndex = partition(arr, low, high);
          quickSort(arr, low, pivotIndex - 1);
          quickSort(arr, pivotIndex + 1, high);
      }
  }
  
  private int partition(int[] arr, int low, int high) {
      int pivotValue = arr[high];
      int i = low - 1;
      for (int j = low; j < high; j++) {
          if (arr[j] < pivotValue) {
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
