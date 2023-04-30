package ChatGPT.QuickSort.T23;

public class QuickSort {

  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1) {
          quickSort(arr, left, index - 1);
      }
      if (index < right) {
          quickSort(arr, index, right);
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
              swap(arr, left, right);
              left++;
              right--;
          }
      }
      return left;
  }

  private void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
}
