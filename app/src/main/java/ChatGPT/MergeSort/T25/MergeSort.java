package ChatGPT.MergeSort.T25;

public class MergeSort {

  public void mergeSort(int[] array) {
    if (array == null) {
      throw new IllegalArgumentException("Input array is null");
    }
    int[] temp = new int[array.length];
    mergeSort(array, temp, 0, array.length - 1);
  }

  private void mergeSort(int[] array, int[] temp, int start, int end) {
    if (start >= end) {
      return; // Base case: array has 0 or 1 element, already sorted
    }
    int mid = (start + end) / 2;
    mergeSort(array, temp, start, mid); // Recursively sort left half
    mergeSort(array, temp, mid + 1, end); // Recursively sort right half
    merge(array, temp, start, mid, end); // Merge sorted halves
  }

  private void merge(int[] array, int[] temp, int start, int mid, int end) {
    for (int i = start; i <= end; i++) {
      temp[i] = array[i]; // Copy array to temp
    }
    int left = start;
    int right = mid + 1;
    for (int i = start; i <= end; i++) {
      if (left > mid) {
        array[i] = temp[right++];
      } else if (right > end) {
        array[i] = temp[left++];
      } else if (temp[left] <= temp[right]) {
        array[i] = temp[left++];
      } else {
        array[i] = temp[right++];
      }
    }
  }

}
