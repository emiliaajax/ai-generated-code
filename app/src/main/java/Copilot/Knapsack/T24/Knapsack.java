package Copilot.Knapsack.T24;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] matrix = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (j - weights[i - 1] >= 0) {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
        }
        return matrix[weights.length][capacity];
    }
}
