package Copilot.BinarySearch.T16;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should
    // return a boolean.
    public boolean binarySearch(int target, int[] array) {
        // Implement a binary search algorithm that returns true if the target is in the
        // array.
        // Use the binary search algorithm from the textbook.
        // Return false if the target is not in the array.
        // Do not use recursion.
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == target) {
                return true;
            }
            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

