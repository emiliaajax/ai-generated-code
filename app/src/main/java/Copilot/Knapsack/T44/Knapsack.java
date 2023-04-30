package Copilot.Knapsack.T44;

public class Knapsack {
    // This is the bottom-up dynamic programming method.
    public int bottomUp(int capacity, int[] weights, int[] values) {
        // Declare a table that has capacity + 1 rows and weights.length + 1 columns.
        int[][] table = new int[capacity + 1][weights.length + 1];
        // Iterate through the table starting at row 1.
        for (int i = 1; i < table.length; i++) {
            // Iterate through the table starting at column 1.
            for (int j = 1; j < table[i].length; j++) {
                // If the weight at index j - 1 is less than or equal to the current row, then
                if (weights[j - 1] <= i) {
                    // Set the current table location to the maximum of the value at the current
                    // location and the value at the current location minus the current weight plus
                    // the current value.
                    table[i][j] = Math.max(table[i][j - 1], table[i - weights[j - 1]][j - 1] + values[j - 1]);
                }
                // Otherwise
                else {
                    // Set the current table location to the value at the current location minus 1.
                    table[i][j] = table[i][j - 1];
                }
            }
        }
        // Return the value at the bottom right corner of the table.
        return table[capacity][weights.length];
    }
}
