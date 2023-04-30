package Copilot.BinarySearch.T35;

public class BinarySearch {
    public static boolean binarySearch(int target, int[] array) {
		// Implement your code here
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				return true;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
}
