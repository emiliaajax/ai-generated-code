package ChatGPT.MergeSort.T27;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] aux = new int[arr.length];
      mergeSortHelper(arr, aux, 0, arr.length - 1);
  }
  
  private void mergeSortHelper(int[] arr, int[] aux, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = start + (end - start) / 2;
      mergeSortHelper(arr, aux, start, mid);
      mergeSortHelper(arr, aux, mid + 1, end);
      merge(arr, aux, start, mid, end);
  }
  
  private void merge(int[] arr, int[] aux, int start, int mid, int end) {
      // copy array into aux
      for (int i = start; i <= end; i++) {
          aux[i] = arr[i];
      }
      // merge
      int i = start;
      int j = mid + 1;
      for (int k = start; k <= end; k++) {
          if (i > mid) {
              arr[k] = aux[j++];
          } else if (j > end) {
              arr[k] = aux[i++];
          } else if (aux[i] < aux[j]) {
              arr[k] = aux[i++];
          } else {
              arr[k] = aux[j++];
          }
      }
  }
}
