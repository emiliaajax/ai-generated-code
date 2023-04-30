package ChatGPT.BinarySearch.T29;

public class BinarySearch {
    
  public boolean binarySearch(int target, int[] array) {
      int low = 0;
      int high = array.length - 1;
      
      while (low <= high) {
          int mid = (low + high) / 2;
          
          if (array[mid] == target) {
              return true;
          } else if (array[mid] < target) {
              low = mid + 1;
          } else {
              high = mid - 1;
          }
      }
      
      return false;
  }
}
