package ChatGPT.BinarySearch.T23;

public class BinarySearch {
    
  public boolean binarySearch(int target, int[] arr) {
      int low = 0;
      int high = arr.length - 1;
      
      while (low <= high) {
          int mid = (low + high) / 2;
          if (arr[mid] == target) {
              return true;
          } else if (arr[mid] < target) {
              low = mid + 1;
          } else {
              high = mid - 1;
          }
      }
      
      return false;
  }
  
}
