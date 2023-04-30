package ChatGPT.MergeSort.T15;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          // Base case: array is already sorted or empty
          return;
      }
      
      int mid = arr.length / 2;
      int[] left = new int[mid];
      int[] right = new int[arr.length - mid];
      
      // Copy elements to left and right subarrays
      for (int i = 0; i < mid; i++) {
          left[i] = arr[i];
      }
      for (int i = mid; i < arr.length; i++) {
          right[i - mid] = arr[i];
      }
      
      // Recursively sort left and right subarrays
      mergeSort(left);
      mergeSort(right);
      
      // Merge sorted left and right subarrays into arr
      merge(left, right, arr);
  }
  
  private void merge(int[] left, int[] right, int[] arr) {
      int i = 0;  // index for left subarray
      int j = 0;  // index for right subarray
      int k = 0;  // index for merged array
      
      while (i < left.length && j < right.length) {
          if (left[i] <= right[j]) {
              arr[k++] = left[i++];
          } else {
              arr[k++] = right[j++];
          }
      }
      
      // Copy remaining elements from left subarray
      while (i < left.length) {
          arr[k++] = left[i++];
      }
      
      // Copy remaining elements from right subarray
      while (j < right.length) {
          arr[k++] = right[j++];
      }
  }
}
