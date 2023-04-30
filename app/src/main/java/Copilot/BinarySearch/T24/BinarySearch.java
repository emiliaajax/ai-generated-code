package Copilot.BinarySearch.T24;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should
    // return a boolean.
    public boolean binarySearch(int value, int[] array) {
        // Implement the binary search algorithm.
        // If the value is in the array, return true.
        // If the value is not in the array, return false.
        int left = 0;
        int right = array.length - 1;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (array[middle] == value) {
                return true;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        return false;
    }
}
