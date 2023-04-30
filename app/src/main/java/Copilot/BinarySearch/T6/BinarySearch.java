package Copilot.BinarySearch.T6;

public class BinarySearch {
    public boolean binarySearch(int value, int[] array) {
        boolean result = false;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (value == array[middle]) {
                result = true;
                break;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return result;
    }
}

