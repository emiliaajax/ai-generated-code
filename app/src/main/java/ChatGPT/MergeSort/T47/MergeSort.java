package ChatGPT.MergeSort.T47;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length == 0) {
          return;
      }
      int[] helper = new int[arr.length];
      mergeSort(arr, helper, 0, arr.length - 1);
  }
  
  private void mergeSort(int[] arr, int[] helper, int low, int high) {
      if (low < high) {
          int mid = (low + high) / 2;
          mergeSort(arr, helper, low, mid);
          mergeSort(arr, helper, mid + 1, high);
          merge(arr, helper, low, mid, high);
      }
  }
  
  private void merge(int[] arr, int[] helper, int low, int mid, int high) {
      for (int i = low; i <= high; i++) {
          helper[i] = arr[i];
      }
      int i = low;
      int j = mid + 1;
      int k = low;
      while (i <= mid && j <= high) {
          if (helper[i] <= helper[j]) {
              arr[k] = helper[i];
              i++;
          } else {
              arr[k] = helper[j];
              j++;
          }
          k++;
      }
      while (i <= mid) {
          arr[k] = helper[i];
          k++;
          i++;
      }
  }
}
