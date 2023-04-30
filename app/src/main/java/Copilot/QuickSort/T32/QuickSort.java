package Copilot.QuickSort.T32;

public class QuickSort {
  public void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private void sort(int[] array, int low, int high) {
    if (high > low) {
      int pivot = partition(array, low, high);
      sort(array, low, pivot - 1);
      sort(array, pivot + 1, high);
    }
  }

  private int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, high);
    return i + 1;
  }

  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
