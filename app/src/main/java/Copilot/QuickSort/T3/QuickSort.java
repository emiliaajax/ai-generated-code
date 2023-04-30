package Copilot.QuickSort.T3;

// Implement a non-static quick sort algorithm class named QuickSort with a public void sort(int[]) method
public class QuickSort {
  public void sort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
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
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}