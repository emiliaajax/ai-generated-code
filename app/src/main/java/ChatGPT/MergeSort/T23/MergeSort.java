package ChatGPT.MergeSort.T23;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return; // base case
      }
      int[] aux = new int[arr.length]; // auxiliary array for merging
      mergeSort(arr, aux, 0, arr.length - 1); // recursive sort
  }
  
  private void mergeSort(int[] arr, int[] aux, int lo, int hi) {
      if (lo >= hi) {
          return; // base case
      }
      int mid = lo + (hi - lo) / 2; // calculate the middle index
      mergeSort(arr, aux, lo, mid); // sort the left half
      mergeSort(arr, aux, mid + 1, hi); // sort the right half
      merge(arr, aux, lo, mid, hi); // merge the two sorted halves
  }
  
  private void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
      // copy the elements to the auxiliary array
      for (int i = lo; i <= hi; i++) {
          aux[i] = arr[i];
      }
      // merge the two halves using two pointers
      int i = lo, j = mid + 1;
      for (int k = lo; k <= hi; k++) {
          if (i > mid) {
              arr[k] = aux[j++];
          } else if (j > hi) {
              arr[k] = aux[i++];
          } else if (aux[i] <= aux[j]) {
              arr[k] = aux[i++];
          } else {
              arr[k] = aux[j++];
          }
      }
  }
  
}
