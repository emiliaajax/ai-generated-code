package ChatGPT.QuickSort.T7;

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
      int pivotIndex = (left + right) / 2;
      int pivotValue = arr[pivotIndex];
      swap(arr, pivotIndex, right); // move pivot to end
      int storeIndex = left;
      for (int i = left; i < right; i++) {
          if (arr[i] < pivotValue) {
              swap(arr, i, storeIndex);
              storeIndex++;
          }
      }
      swap(arr, storeIndex, right); // move pivot to its final place
      return storeIndex;
  }

  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}
