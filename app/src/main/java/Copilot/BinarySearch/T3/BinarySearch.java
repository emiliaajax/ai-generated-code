package Copilot.BinarySearch.T3;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        System.out.println(binarySearch(key, list));
    }

    // Implement the binarySearch method
    public static boolean binarySearch(int key, int[] list) {
        // Implement the binarySearch method
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return true;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
