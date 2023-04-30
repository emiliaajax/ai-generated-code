package Copilot.Knapsack.T31;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] knapsack = new int[weights.length + 1][capacity + 1];
        for (int i = 0; i <= weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    knapsack[i][j] = 0;
                } else if (weights[i - 1] <= j) {
                    knapsack[i][j] = Math.max(values[i - 1] + knapsack[i - 1][j - weights[i - 1]], knapsack[i - 1][j]);
                } else {
                    knapsack[i][j] = knapsack[i - 1][j];
                }
            }
        }
        return knapsack[weights.length][capacity];
    }
}
