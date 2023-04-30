package ChatGPT.QuickSort.T46;

public class QuickSort {
  public void sort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      quicksort(arr, 0, arr.length - 1);
  }

  private void quicksort(int[] arr, int left, int right) {
      int i = left;
      int j = right;
      int pivot = arr[left + (right - left) / 2];

      while (i <= j) {
          while (arr[i] < pivot) {
              i++;
          }
          while (arr[j] > pivot) {
              j--;
          }
          if (i <= j) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;
          }
      }

      if (left < j) {
          quicksort(arr, left, j);
      }
      if (i < right) {
          quicksort(arr, i, right);
      }
  }
}
