package Copilot.BinarySearch.T39;

public class BinarySearch {
  // Implement the public binarySearch(int, int[]) method. The method should return a boolean.
  public boolean binarySearch(int key, int[] a) {
    int low = 0;
    int high = a.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (key < a[mid]) {
        high = mid - 1;
      } else if (key > a[mid]) {
        low = mid + 1;
      } else {
        return true;
      }
    }
    return false;
  }
}
