package ChatGPT.BinarySearch.T50;

public class BinarySearch {
  public boolean binarySearch(int key, int[] array) {
      int low = 0;
      int high = array.length - 1;

      while (low <= high) {
          int mid = (low + high) / 2;

          if (array[mid] == key) {
              return true;
          } else if (array[mid] < key) {
              low = mid + 1;
          } else {
              high = mid - 1;
          }
      }

      return false;
  }
}
