package Copilot.BinarySearch.T8;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should
    // return a boolean.
    public boolean binarySearch(int searchValue, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] == searchValue) {
                return true;
            } else if (arr[middle] < searchValue) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return false;
    }
}

