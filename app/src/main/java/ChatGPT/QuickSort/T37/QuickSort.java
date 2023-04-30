package ChatGPT.QuickSort.T37;

public class QuickSort {
    
  public void sort(int[] arr) {
      quickSort(arr, 0, arr.length - 1);
  }
  
  private void quickSort(int[] arr, int left, int right) {
      if (left >= right) {
          return;
      }
      int pivotIndex = partition(arr, left, right);
      quickSort(arr, left, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, right);
  }
  
  private int partition(int[] arr, int left, int right) {
      int pivotValue = arr[right];
      int i = left;
      for (int j = left; j < right; j++) {
          if (arr[j] < pivotValue) {
              swap(arr, i, j);
              i++;
          }
      }
      swap(arr, i, right);
      return i;
  }
  
  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}