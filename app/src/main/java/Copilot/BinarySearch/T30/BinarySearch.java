package Copilot.BinarySearch.T30;

public class BinarySearch {
    // Implement a method named binarySearch that accepts an int and an array of
    // ints.
    // The method should return true if the array contains the int, false otherwise.
    public boolean binarySearch(int key, int[] array) {

        // Throw an IllegalArgumentException if the array is null.
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        // Set the initial values for the low and high indices.
        int low = 0;
        int high = array.length - 1;

        // Loop until the low index is greater than the high index.
        while (low <= high) {

            // Set the mid index.
            int mid = (low + high) / 2;

            // If the key is less than the mid index, set the high index to one less than
            // the mid index.
            if (key < array[mid]) {
                high = mid - 1;
            }

            // If the key is greater than the mid index, set the low index to one greater
            // than the mid index.
            else if (key > array[mid]) {
                low = mid + 1;
            }

            // Otherwise, the key is equal to the mid index, so return true.
            else {
                return true;
            }
        }

        // If the key is not found, return false.
        return false;

    }
}
