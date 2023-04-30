package ChatGPT.QuickSort.T27;

public class QuickSort {
  
  public void sort(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    quicksort(arr, 0, arr.length - 1);
  }

  private void quicksort(int[] arr, int low, int high) {
    int i = low, j = high;
    int pivot = arr[low + (high - low) / 2];

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
    if (low < j) {
      quicksort(arr, low, j);
    }
    if (i < high) {
      quicksort(arr, i, high);
    }
  }
}
