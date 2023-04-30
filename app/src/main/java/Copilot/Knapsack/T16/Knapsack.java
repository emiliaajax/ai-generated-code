package Copilot.Knapsack.T16;

public class Knapsack {
    // Implement the bottomUp method.
    public int bottomUp(int capacity, int[] weights, int[] values) {
        // Create a 2D array to store the values.
        int[][] table = new int[values.length + 1][capacity + 1];
        // Loop through the array.
        for (int i = 1; i <= values.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                // If the current capacity is greater than the current weight, then find the
                // maximum.
                if (j >= weights[i - 1]) {
                    table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        // Return the last element in the table.
        return table[values.length][capacity];
    }
}
