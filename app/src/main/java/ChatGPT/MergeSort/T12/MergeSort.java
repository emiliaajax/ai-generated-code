package ChatGPT.MergeSort.T12;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      int n = arr.length;
      int[] aux = new int[n];
      mergeSort(arr, aux, 0, n - 1);
  }
  
  private void mergeSort(int[] arr, int[] aux, int low, int high) {
      if (low >= high) {
          return;
      }
      int mid = low + (high - low) / 2;
      mergeSort(arr, aux, low, mid);
      mergeSort(arr, aux, mid + 1, high);
      merge(arr, aux, low, mid, high);
  }
  
  private void merge(int[] arr, int[] aux, int low, int mid, int high) {
      for (int i = low; i <= high; i++) {
          aux[i] = arr[i];
      }
      int i = low;
      int j = mid + 1;
      for (int k = low; k <= high; k++) {
          if (i > mid) {
              arr[k] = aux[j++];
          } else if (j > high) {
              arr[k] = aux[i++];
          } else if (aux[i] <= aux[j]) {
              arr[k] = aux[i++];
          } else {
              arr[k] = aux[j++];
          }
      }
  }
  
}
