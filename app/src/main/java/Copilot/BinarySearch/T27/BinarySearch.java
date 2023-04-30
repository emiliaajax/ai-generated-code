package Copilot.BinarySearch.T27;

public class BinarySearch {
    // implement the binarySearch method
    public boolean binarySearch(int search, int[] data) {
        // implement binary search
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data[mid] == search) {
                return true;
            } else if (data[mid] > search) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
