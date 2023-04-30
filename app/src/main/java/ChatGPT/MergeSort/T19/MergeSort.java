package ChatGPT.MergeSort.T19;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length < 2) {
          return;
      }
      int[] aux = new int[arr.length];
      mergeSort(arr, aux, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int[] aux, int left, int right) {
      if (left == right) {
          return;
      }
      int mid = left + (right - left) / 2;
      mergeSort(arr, aux, left, mid);
      mergeSort(arr, aux, mid + 1, right);
      merge(arr, aux, left, mid, right);
  }
  
  private void merge(int[] arr, int[] aux, int left, int mid, int right) {
      for (int i = left; i <= right; i++) {
          aux[i] = arr[i];
      }
      int i = left;
      int j = mid + 1;
      for (int k = left; k <= right; k++) {
          if (i > mid) {
              arr[k] = aux[j++];
          } else if (j > right) {
              arr[k] = aux[i++];
          } else if (aux[j] < aux[i]) {
              arr[k] = aux[j++];
          } else {
              arr[k] = aux[i++];
          }
      }
  }
}
