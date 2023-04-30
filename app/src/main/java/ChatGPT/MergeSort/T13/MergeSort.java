package ChatGPT.MergeSort.T13;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
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
      int left = low;
      int right = mid + 1;
      int current = low;
      while (left <= mid && right <= high) {
          if (helper[left] <= helper[right]) {
              arr[current] = helper[left];
              left++;
          } else {
              arr[current] = helper[right];
              right++;
          }
          current++;
      }
      int remaining = mid - left;
      for (int i = 0; i <= remaining; i++) {
          arr[current + i] = helper[left + i];
      }
  }
}
