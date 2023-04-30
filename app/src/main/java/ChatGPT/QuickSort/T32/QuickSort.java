package ChatGPT.QuickSort.T32;

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
    int pivotIndex = partition(arr, left, right);
    quickSort(arr, left, pivotIndex - 1);
    quickSort(arr, pivotIndex + 1, right);
  }

  private int partition(int[] arr, int left, int right) {
    int pivotIndex = choosePivot(left, right);
    int pivotValue = arr[pivotIndex];
    swap(arr, pivotIndex, right);
    int storeIndex = left;
    for (int i = left; i < right; i++) {
      if (arr[i] < pivotValue) {
        swap(arr, i, storeIndex);
        storeIndex++;
      }
    }
    swap(arr, storeIndex, right);
    return storeIndex;
  }

  private int choosePivot(int left, int right) {
    return left + (right - left) / 2;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
