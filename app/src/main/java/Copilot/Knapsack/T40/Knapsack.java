package Copilot.Knapsack.T40;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] knapsack = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j >= weights[i - 1]) {
                    knapsack[i][j] = Math.max(knapsack[i - 1][j], knapsack[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    knapsack[i][j] = knapsack[i - 1][j];
                }
            }
        }
        return knapsack[weights.length][capacity];
    }
}
