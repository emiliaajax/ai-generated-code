package Copilot.Knapsack.T35;

public class Knapsack {
    // Implement the bottom-up dynamic programming solution to the 0-1 knapsack problem.
    // This method should return an int with the maximum value.
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] knapsack = new int[weights.length + 1][capacity + 1];

        for (int i = 1; i < weights.length + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (weights[i - 1] <= j) {
                    knapsack[i][j] = Math.max(knapsack[i - 1][j], knapsack[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    knapsack[i][j] = knapsack[i - 1][j];
                }
            }
        }
        return knapsack[weights.length][capacity];
    }
}
