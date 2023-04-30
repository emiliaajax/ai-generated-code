package Copilot.BinarySearch.T36;

public class BinarySearch {
    // Implement the binarySearch method here.
    public boolean binarySearch(int target, int[] data) {
        // Implement the binary search algorithm here.
        int low = 0;
        int high = data.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (data[mid] == target) {
                return true;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
