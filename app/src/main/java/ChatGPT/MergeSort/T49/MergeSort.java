package ChatGPT.MergeSort.T49;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] aux = new int[arr.length];
      mergeSort(arr, aux, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int[] aux, int start, int end) {
      if (start >= end) {
          return;
      }
      int mid = (start + end) / 2;
      mergeSort(arr, aux, start, mid);
      mergeSort(arr, aux, mid + 1, end);
      merge(arr, aux, start, mid, end);
  }
  
  private void merge(int[] arr, int[] aux, int start, int mid, int end) {
      System.arraycopy(arr, start, aux, start, end - start + 1);
      int i = start;
      int j = mid + 1;
      for (int k = start; k <= end; k++) {
          if (i > mid) {
              arr[k] = aux[j++];
          } else if (j > end) {
              arr[k] = aux[i++];
          } else if (aux[j] < aux[i]) {
              arr[k] = aux[j++];
          } else {
              arr[k] = aux[i++];
          }
      }
  }
  
}
