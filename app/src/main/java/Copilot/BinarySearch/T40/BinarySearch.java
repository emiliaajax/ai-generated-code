package Copilot.BinarySearch.T40;

public class BinarySearch {
    // Implement the binarySearch method here.
    public boolean binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
