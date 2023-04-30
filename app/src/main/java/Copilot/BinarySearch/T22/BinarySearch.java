package Copilot.BinarySearch.T22;

public class BinarySearch {
  // Implement the binarySearch method
  public boolean binarySearch(int x, int[] array) {
    // Implement the binary search algorithm here
    // The method should return true if x is in array, false otherwise
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (array[mid] == x) {
        return true;
      } else if (array[mid] < x) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return false;
  }
}
