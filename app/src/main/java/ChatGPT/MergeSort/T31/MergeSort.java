package ChatGPT.MergeSort.T31;

public class MergeSort {
    
  public void mergeSort(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return; // base case
      }
      
      int mid = arr.length / 2;
      int[] leftArr = new int[mid];
      int[] rightArr = new int[arr.length - mid];
      
      // Copy elements to left and right arrays
      for (int i = 0; i < mid; i++) {
          leftArr[i] = arr[i];
      }
      for (int i = mid; i < arr.length; i++) {
          rightArr[i - mid] = arr[i];
      }
      
      // Recursively sort the left and right subarrays
      mergeSort(leftArr);
      mergeSort(rightArr);
      
      // Merge the sorted left and right subarrays
      merge(arr, leftArr, rightArr);
  }
  
  private void merge(int[] arr, int[] leftArr, int[] rightArr) {
      int i = 0, j = 0, k = 0;
      
      while (i < leftArr.length && j < rightArr.length) {
          if (leftArr[i] <= rightArr[j]) {
              arr[k++] = leftArr[i++];
          } else {
              arr[k++] = rightArr[j++];
          }
      }
      
      // Copy remaining elements from left or right array, if any
      while (i < leftArr.length) {
          arr[k++] = leftArr[i++];
      }
      while (j < rightArr.length) {
          arr[k++] = rightArr[j++];
      }
  }
}
