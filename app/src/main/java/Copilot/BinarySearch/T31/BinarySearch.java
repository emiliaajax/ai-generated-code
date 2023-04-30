package Copilot.BinarySearch.T31;

public class BinarySearch {
    // Declare a private static int array named data.
    private static int[] data;

    // Declare a public constructor that takes an int array as a parameter.
    public BinarySearch(int[] data) {
        // Assign the parameter int array to the private int array data.
        this.data = data;
    }

    // Implement the public binarySearch(int, int[]) method. The method should
    // return a boolean.
    public static boolean binarySearch(int target, int[] data) {
        // Create an int variable named low and assign it the value of 0.
        int low = 0;
        // Create an int variable named high and assign it the value of the length of
        // the parameter int array - 1.
        int high = data.length - 1;
        // Create a while loop that checks if low is less than or equal to high.
        while (low <= high) {
            // Create an int variable named mid and assign it the value of low + high
            // divided by 2.
            int mid = (low + high) / 2;
            // Create an if statement that checks if the element at index mid in the
            // parameter int array is equal to the target.
            if (data[mid] == target) {
                // Return true.
                return true;
                // Create an else if statement that checks if the element at index mid in the
                // parameter int array is greater than the target.
            } else if (data[mid] > target) {
                // Assign high the value of mid - 1.
                high = mid - 1;
                // Create an else statement.
            } else {
                // Assign low the value of mid + 1.
                low = mid + 1;
            }
            // Close the while loop.
        }
        // Return false.
        return false;
        // Close the binarySearch method.
    }
    // Close the BinarySearch class.
}
