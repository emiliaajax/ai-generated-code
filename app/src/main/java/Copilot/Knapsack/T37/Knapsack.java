package Copilot.Knapsack.T37;

public class Knapsack {
    private int capacity;
    private int[] weights;
    private int[] values;

    public Knapsack(int capacity, int[] weights, int[] values) {
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
    }

    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] matrix = new int[weights.length + 1][capacity + 1];
        for (int i = 0; i < weights.length + 1; i++) {
            for (int j = 0; j < capacity + 1; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (weights[i - 1] <= j) {
                    matrix[i][j] = Math.max(values[i - 1] + matrix[i - 1][j - weights[i - 1]], matrix[i - 1][j]);
                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
        }
        return matrix[weights.length][capacity];
    }
}
