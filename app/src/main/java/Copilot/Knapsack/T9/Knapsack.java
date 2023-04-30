package Copilot.Knapsack.T9;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] matrix = new int[weights.length + 1][capacity + 1];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = 0;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (weights[i - 1] <= j) {
                    matrix[i][j] = Math.max(values[i - 1] + matrix[i - 1][j - weights[i - 1]], matrix[i - 1][j]);
                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
        }

        return matrix[weights.length][capacity];
    }
}
