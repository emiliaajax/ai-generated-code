package Copilot.BinarySearch.T37;

public class BinarySearch {
    public boolean binarySearch(int key, int[] array) {
        // Implement the method
        // Return true if key is found in array
        // Return false if key is not found in array
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (array[mid] == key) {
                return true;
            } else if (array[mid] < key) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return false;
    }
}
