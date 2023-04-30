package Copilot.QuickSort.T4;

// Implement a non-static quick sort algorithm class named QuickSort with a public void sort(int[]) method
public class QuickSort {
  public void sort(int[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private void sort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      sort(arr, low, pivot - 1);
      sort(arr, pivot + 1, high);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  private void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}