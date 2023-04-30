package Copilot.BinarySearch.T47;

public class BinarySearch {
  public boolean binarySearch(int x, int[] arr) {
    // Implement this method
    // Do not change the method signature (name, parameters)
    int n = arr.length;
    int mid = (n - 1) / 2;
    if (arr[mid] == x) {
      return true;
    }
    if (arr[mid] < x) {
      int[] arr2 = new int[n - mid - 1];
      for (int i = mid + 1; i < n; i++) {
        arr2[i - mid - 1] = arr[i];
      }
      return binarySearch(x, arr2);
    }
    if (arr[mid] > x) {
      int[] arr2 = new int[mid];
      for (int i = 0; i < mid; i++) {
        arr2[i] = arr[i];
      }
      return binarySearch(x, arr2);
    }
    return false;
  }
}

