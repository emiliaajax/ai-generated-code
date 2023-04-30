package Copilot.BinarySearch.T44;

public class BinarySearch {
    public boolean binarySearch(int target, int[] input) {
        // If the input is null or empty, return false.
        if (input == null || input.length == 0) {
            return false;
        }
        // If the input is not null or empty, return true if the target is found.
        // Otherwise, return false.
        int low = 0;
        int high = input.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (input[mid] == target) {
                return true;
            } else if (input[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
