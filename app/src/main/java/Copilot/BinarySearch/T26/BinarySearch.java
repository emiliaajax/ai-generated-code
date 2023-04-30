package Copilot.BinarySearch.T26;

public class BinarySearch {
    // Implement a non-static method named binarySearch(int, int[]) that takes an
    // integer and an integer array as arguments.
    // The method should return a boolean.
    public boolean binarySearch(int target, int[] array) {
        // Implement a variable named low of type int and initialize it to 0.
        int low = 0;
        // Implement a variable named high of type int and initialize it to the length
        // of the array minus 1.
        int high = array.length - 1;
        // Implement a while loop that executes while low is less than or equal to high.
        while (low <= high) {
            // Implement a variable named mid of type int and initialize it to the average
            // of low and high.
            int mid = (low + high) / 2;
            // Implement an if statement that checks if the value at index mid in the array
            // is equal to target.
            if (array[mid] == target) {
                // If the condition is true, return true.
                return true;
            }
            // Implement an else if statement that checks if the value at index mid in the
            // array is less than target.
            else if (array[mid] < target) {
                // If the condition is true, set low to mid plus 1.
                low = mid + 1;
            }
            // Implement an else statement.
            else {
                // Set high to mid minus 1.
                high = mid - 1;
            }
        }
        // If the method has not returned true yet, return false.
        return false;
    }
}
