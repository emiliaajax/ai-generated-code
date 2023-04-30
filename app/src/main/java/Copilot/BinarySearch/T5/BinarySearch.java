package Copilot.BinarySearch.T5;

public class BinarySearch {
    public boolean binarySearch(int value, int[] arr) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return true;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return false;
    }
}
