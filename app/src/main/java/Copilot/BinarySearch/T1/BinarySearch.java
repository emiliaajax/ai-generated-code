package Copilot.BinarySearch.T1;

public class BinarySearch {
  public boolean binarySearch(int target, int[] array) {
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (target == array[mid]) {
        return true;
      } else if (target < array[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return false;
  }
}
