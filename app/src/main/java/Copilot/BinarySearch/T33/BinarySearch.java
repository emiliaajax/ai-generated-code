package Copilot.BinarySearch.T33;

public class BinarySearch {
    public boolean binarySearch(int target, int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < array[mid]) {
                right = mid - 1;
            } else if (target > array[mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
