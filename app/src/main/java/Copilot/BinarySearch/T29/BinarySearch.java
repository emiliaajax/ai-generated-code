package Copilot.BinarySearch.T29;

public class BinarySearch {
    // Implement this method
    public static boolean binarySearch(int target, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < array[mid]) {
                high = mid - 1;
            } else if (target > array[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
