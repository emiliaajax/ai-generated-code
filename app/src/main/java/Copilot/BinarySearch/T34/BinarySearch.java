package Copilot.BinarySearch.T34;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should
    // return a boolean.
    public boolean binarySearch(int value, int[] array) {
        // Implement the binary search algorithm.
        // The method should return true if the value is found in the array, otherwise
        // false.
        // Start your code here.
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == array[mid]) {
                return true;
            } else if (value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
        // End your code here.
    }
}
