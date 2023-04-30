package Copilot.BinarySearch.T2;

public class BinarySearch {
  // Implement the public binarySearch(int, int[]) method. The method should return a boolean.
  public boolean binarySearch(int key, int[] array) {
    // Implement the binary search algorithm
    int low = 0;
    int high = array.length - 1;
    int mid = (low + high) / 2;
    while (low <= high) {
      if (key < array[mid]) {
        high = mid - 1;
      } else if (key > array[mid]) {
        low = mid + 1;
      } else {
        return true;
      }
      mid = (low + high) / 2;
    }
    return false;
  }
}
