package Copilot.QuickSort.T27;

public class QuickSort {
  public void sort(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int left, int right) {
    if (left >= right) {
      return;
    }
    int pivot = arr[(left + right) / 2];
    int index = partition(arr, left, right, pivot);
    quickSort(arr, left, index - 1);
    quickSort(arr, index, right);
  }

  private int partition(int[] arr, int left, int right, int pivot) {
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
