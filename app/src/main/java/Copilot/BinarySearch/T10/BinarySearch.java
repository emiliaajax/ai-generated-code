package Copilot.BinarySearch.T10;

public class BinarySearch {
  public static void main(String[] args) {
    int[] myArray = { 1, 3, 5, 7, 9 };
    BinarySearch bs = new BinarySearch();
    System.out.println(bs.binarySearch(7, myArray));
  }

  public boolean binarySearch(int value, int[] array) {
    int low = 0;
    int high = array.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (array[mid] == value) {
        return true;
      } else if (array[mid] < value) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return false;
  }
}

