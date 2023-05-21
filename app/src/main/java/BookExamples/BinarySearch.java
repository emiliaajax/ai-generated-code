package BookExamples;

// Source: https://github.com/TrainingByPackt/Data-Structures-and-Algorithms-in-Java/blob/master/src/main/java/com/packt/datastructuresandalg/lesson1/binarysearch/BinarySearch.java
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
