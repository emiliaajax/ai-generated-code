package ChatGPT.QuickSort.T29;

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
      int pivot = arr[left];
      int i = left - 1;
      int j = right + 1;
      while (true) {
          do {
              i++;
          } while (arr[i] < pivot);
          do {
              j--;
          } while (arr[j] > pivot);
          if (i >= j) {
              return j;
          }
          swap(arr, i, j);
      }
  }
  
  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}

