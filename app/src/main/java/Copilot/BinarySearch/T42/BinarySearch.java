package Copilot.BinarySearch.T42;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int itemToFind = 10;
        System.out.println(binarySearch(itemToFind, sortedArray));
    }

    public static boolean binarySearch(int item, int[] sortedArray) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (item == sortedArray[mid]) {
                return true;
            } else if (item < sortedArray[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
