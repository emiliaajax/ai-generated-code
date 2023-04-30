package Copilot.BinarySearch.T4;

public class BinarySearch {
    // Implement the binarySearch method.
    public boolean binarySearch(int search, int[] numbers) {
        boolean found = false;
        int left = 0;
        int right = numbers.length - 1;
        int middle = (left + right) / 2;
        while (left <= right) {
            if (numbers[middle] < search) {
                left = middle + 1;
            } else if (numbers[middle] == search) {
                found = true;
                break;
            } else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
        return found;
    }
}
