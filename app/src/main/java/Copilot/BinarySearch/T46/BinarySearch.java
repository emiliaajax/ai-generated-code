package Copilot.BinarySearch.T46;

public class BinarySearch {
    // Implement a public binarySearch(int, int[]) method. The method should return a boolean.
    // The method should return true if the key is found in the array, and false if it is not.
    public boolean binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] == key) {
                return true;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return false;
    }
}
