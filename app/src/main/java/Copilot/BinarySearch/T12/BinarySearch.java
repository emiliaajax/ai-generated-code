package Copilot.BinarySearch.T12;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(binarySearch(5, test));
        System.out.println(binarySearch(11, test));
    }

    public static boolean binarySearch(int x, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}

