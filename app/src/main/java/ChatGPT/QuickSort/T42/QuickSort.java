package ChatGPT.QuickSort.T42;

public class QuickSort {
    
  public void sort(int[] arr) {
      quickSort(arr, 0, arr.length - 1);
  }
  
  private void quickSort(int[] arr, int left, int right) {
      if (left < right) {
          int pivotIndex = partition(arr, left, right);
          quickSort(arr, left, pivotIndex - 1);
          quickSort(arr, pivotIndex + 1, right);
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

