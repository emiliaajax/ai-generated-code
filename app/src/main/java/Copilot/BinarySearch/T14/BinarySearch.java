package Copilot.BinarySearch.T14;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9, 11, 13 };
        int key = 7;
        System.out.println(binarySearch(key, a));
    }

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

