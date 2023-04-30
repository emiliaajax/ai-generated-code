package ChatGPT.BinarySearch.T33;

public class BinarySearch {
  public boolean binarySearch(int target, int[] array) {
      int left = 0;
      int right = array.length - 1;

      while (left <= right) {
          int mid = left + (right - left) / 2;

          if (array[mid] == target) {
              return true;
          } else if (array[mid] < target) {
              left = mid + 1;
          } else {
              right = mid - 1;
          }
      }

      return false;
  }
}
