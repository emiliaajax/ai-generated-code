package Copilot.BinarySearch.T11;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should return a boolean.
    // The method should return true if the key is found in the array, else it should return false.
    public boolean binarySearch(int key, int[] array) {
        // Implement the binary search algorithm
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

