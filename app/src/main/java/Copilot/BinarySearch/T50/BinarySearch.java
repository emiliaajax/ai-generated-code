package Copilot.BinarySearch.T50;

public class BinarySearch {
    // Implement the public binarySearch(int, int[]) method. The method should return a boolean.
    public static boolean binarySearch(int key, int[] list) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return true;
            else
                low = mid + 1;
        }
        return false;
    }
}
