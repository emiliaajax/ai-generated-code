package Copilot.BinarySearch.T32;

public class BinarySearch {
    public static boolean binarySearch(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                high = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
