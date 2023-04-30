package Copilot.BinarySearch.T49;

public class BinarySearch {
    public boolean binarySearch(int target, int[] array) {
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (target == array[mid]) {
                return true;
            } else if (target < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
}
