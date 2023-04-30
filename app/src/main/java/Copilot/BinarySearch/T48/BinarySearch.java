package Copilot.BinarySearch.T48;

public class BinarySearch {
    // The method should return a boolean.
    // The method should take an int and an int[] as parameters.
    public boolean binarySearch(int n, int[] a) {
        // Declare and initialize a boolean variable called found.
        boolean found = false;
        // Declare and initialize an int variable called start.
        int start = 0;
        // Declare and initialize an int variable called end.
        int end = a.length - 1;
        // Declare and initialize an int variable called middle.
        int middle = (start + end) / 2;
        // While start is less than or equal to end and found is false.
        while (start <= end && found == false) {
            // If a[middle] is equal to n.
            if (a[middle] == n) {
                // Set found to true.
                found = true;
            }
            // Else if a[middle] is less than n.
            else if (a[middle] < n) {
                // Set start to middle + 1.
                start = middle + 1;
            }
            // Else.
            else {
                // Set end to middle - 1.
                end = middle - 1;
            }
            // Set middle to (start + end) / 2.
            middle = (start + end) / 2;
        }
        // Return found.
        return found;
    }
}
