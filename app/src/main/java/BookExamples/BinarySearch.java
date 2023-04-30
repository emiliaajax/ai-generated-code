package BookExamples;

public class BinarySearch {
  public boolean binarySearch(int x, int[] sortedNumbers) {
    int end = sortedNumbers.length - 1;
    int start = 0;
    while (start <= end) {
        int mid = (end - start) / 2 + start;
        if (sortedNumbers[mid] == x) return true;
        else if (sortedNumbers[mid] > x) end = mid - 1;
        else start = mid + 1;
    }
    return false;
  }
}
