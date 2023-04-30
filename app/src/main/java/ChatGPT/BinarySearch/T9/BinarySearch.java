package ChatGPT.BinarySearch.T9;

public class BinarySearch {
  
  public boolean binarySearch(int target, int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    
    while (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] == target) {
        return true;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    
    return false;
  }
}
