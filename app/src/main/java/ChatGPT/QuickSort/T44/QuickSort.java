package ChatGPT.QuickSort.T44;

public class QuickSort {
  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quickSort(arr, 0, arr.length - 1);
  }
  
  private void quickSort(int[] arr, int left, int right) {
      int pivotIndex = partition(arr, left, right);
      if (left < pivotIndex - 1) {
          quickSort(arr, left, pivotIndex - 1);
      }
      if (right > pivotIndex) {
          quickSort(arr, pivotIndex, right);
      }
  }
  
  private int partition(int[] arr, int left, int right) {
      int pivot = arr[(left + right) / 2];
      while (left <= right) {
          while (arr[left] < pivot) {
              left++;
          }
          while (arr[right] > pivot) {
              right--;
          }
          if (left <= right) {
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
              left++;
              right--;
          }
      }
      return left;
  }
}
