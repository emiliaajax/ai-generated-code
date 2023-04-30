package Copilot.BinarySearch.T45;

public class BinarySearch {
    // Implement the binarySearch method.
    public boolean binarySearch(int searchValue, int[] arr) {
        // Implement the binarySearch method.
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (searchValue == arr[middle]) {
                return true;
            } else if (searchValue > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        return false;
    }
}
