package Copilot.BinarySearch.T38;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should return a boolean.
    public boolean binarySearch(int search, int[] array) {
        // Implement the binarySearch method
        int size = array.length;
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == search) {
                return true;
            } else if (array[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
