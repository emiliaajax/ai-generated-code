package Copilot.BinarySearch.T7;

public class BinarySearch {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 1, 3, 4, 6, 7, 9, 11, 12, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 };
        // Create a BinarySearch object
        BinarySearch search = new BinarySearch();
        // Call the binarySearch method on the search object
        boolean result = search.binarySearch(9, numbers);
        System.out.println(result);
    }

    // Implement the binarySearch method
    public boolean binarySearch(int target, int[] numbers) {
        // Declare and initialize two variables
        int low = 0;
        int high = numbers.length - 1;
        // Implement the algorithm
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                return true;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}

