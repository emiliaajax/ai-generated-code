package Copilot.Knapsack.T42;

public class Knapsack {
    public static void main(String[] args) {
        int capacity = 5;
        int[] weights = { 2, 3, 4, 5 };
        int[] values = { 3, 4, 5, 6 };
        Knapsack knapsack = new Knapsack();
        System.out.println(knapsack.bottomUp(capacity, weights, values));
    }

    // Implement the bottomUp method here
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] matrix = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (weights[i - 1] > j) {
                    matrix[i][j] = matrix[i - 1][j];
                } else {
                    matrix[i][j] = Math.max(values[i - 1] + matrix[i - 1][j - weights[i - 1]], matrix[i - 1][j]);
                }
            }
        }
        return matrix[weights.length][capacity];
    }
}
