package ChatGPT.MergeSort.T39;

public class MergeSort {

  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return;
      }
      int[] helper = new int[arr.length];
      mergeSort(arr, helper, 0, arr.length - 1);
  }

  private void mergeSort(int[] arr, int[] helper, int left, int right) {
      if (left < right) {
          int middle = (left + right) / 2;
          mergeSort(arr, helper, left, middle);
          mergeSort(arr, helper, middle + 1, right);
          merge(arr, helper, left, middle, right);
      }
  }

  private void merge(int[] arr, int[] helper, int left, int middle, int right) {
      for (int i = left; i <= right; i++) {
          helper[i] = arr[i];
      }
      int i = left;
      int j = middle + 1;
      int k = left;
      while (i <= middle && j <= right) {
          if (helper[i] <= helper[j]) {
              arr[k] = helper[i];
              i++;
          } else {
              arr[k] = helper[j];
              j++;
          }
          k++;
      }
      while (i <= middle) {
          arr[k] = helper[i];
          k++;
          i++;
      }
  }
}
