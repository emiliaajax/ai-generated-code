package Copilot.Knapsack.T27;

public class Knapsack {
    // Implement the public int bottomUp(int capacity, int[] weights, int[] values)
    // method. The method should return an int with the maximum value.
    public int bottomUp(int capacity, int[] weights, int[] values) {
        // Create a 2D array of ints named table with capacity + 1 rows and
        // weights.length + 1 columns
        int[][] table = new int[capacity + 1][weights.length + 1];
        // Initialize the first row to 0
        for (int i = 0; i < weights.length + 1; i++) {
            table[0][i] = 0;
        }
        // Initialize the first column to 0
        for (int i = 0; i < capacity + 1; i++) {
            table[i][0] = 0;
        }
        // For each row from 1 to capacity
        for (int i = 1; i < capacity + 1; i++) {
            // For each column from 1 to weights.length
            for (int j = 1; j < weights.length + 1; j++) {
                // If the weight at column - 1 is less than or equal to the current row
                if (weights[j - 1] <= i) {
                    // Set the current cell to the maximum of the value at the cell directly above,
                    // or the value at the cell to the left plus the value at the current column - 1
                    table[i][j] = Math.max(table[i][j - 1], table[i - weights[j - 1]][j - 1] + values[j - 1]);
                } else {
                    // Otherwise, set the current cell to the value of the cell directly above
                    table[i][j] = table[i][j - 1];
                }
            }
        }
        // Return the value at the bottom right cell of the table
        return table[capacity][weights.length];
    }
}
