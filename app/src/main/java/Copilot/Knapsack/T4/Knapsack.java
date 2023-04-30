package Copilot.Knapsack.T4;

public class Knapsack {
    // Implement a non-static 0-1 knapsack class named Knapsack.
    // Implement the public int bottomUp(int capacity, int[] weights, int[] values) method. The method should return an int with the maximum value.
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[weights.length + 1][capacity + 1];
        for (int i = 0; i <= weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (weights[i - 1] <= j) {
                    table[i][j] = Math.max(values[i - 1] + table[i - 1][j - weights[i - 1]], table[i - 1][j]);
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        return table[weights.length][capacity];
    }
}
