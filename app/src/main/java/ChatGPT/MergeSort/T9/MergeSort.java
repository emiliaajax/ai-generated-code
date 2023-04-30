package ChatGPT.MergeSort.T9;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return; // nothing to sort
      }
      int[] aux = new int[arr.length];
      mergeSort(arr, aux, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int[] aux, int lo, int hi) {
      if (lo >= hi) {
          return; // base case, single element
      }
      int mid = lo + (hi - lo) / 2;
      mergeSort(arr, aux, lo, mid); // sort left half
      mergeSort(arr, aux, mid + 1, hi); // sort right half
      merge(arr, aux, lo, mid, hi); // merge sorted halves
  }
  
  private void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
      // copy arr to aux
      for (int i = lo; i <= hi; i++) {
          aux[i] = arr[i];
      }
      // merge sorted halves
      int i = lo, j = mid + 1;
      for (int k = lo; k <= hi; k++) {
          if (i > mid) {
              arr[k] = aux[j++];
          } else if (j > hi) {
              arr[k] = aux[i++];
          } else if (aux[j] < aux[i]) {
              arr[k] = aux[j++];
          } else {
              arr[k] = aux[i++];
          }
      }
  }
}
