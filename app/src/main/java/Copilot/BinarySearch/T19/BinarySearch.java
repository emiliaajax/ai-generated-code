package Copilot.BinarySearch.T19;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should
    // return a boolean.
    public static boolean binarySearch(int search, int[] array) {
        // Implement the binary search algorithm.
        // Return true if the search value is found in the array; otherwise, return
        // false.
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (search == array[mid]) {
                return true;
            } else if (search < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}

