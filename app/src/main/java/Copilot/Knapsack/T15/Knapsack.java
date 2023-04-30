package Copilot.Knapsack.T15;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        int[][] matrix = new int[n + 1][capacity + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    matrix[i][j] = Math.max(values[i - 1] + matrix[i - 1][j - weights[i - 1]], matrix[i - 1][j]);
                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
        }
        return matrix[n][capacity];
    }
}
