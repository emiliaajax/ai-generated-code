package Copilot.Knapsack.T25;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] knapsack = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    knapsack[i][j] = knapsack[i - 1][j];
                } else {
                    knapsack[i][j] = Math.max(knapsack[i - 1][j], knapsack[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }
        return knapsack[weights.length][capacity];
    }
}
