package Copilot.Knapsack.T34;

public class Knapsack {
    public static void main(String[] args) {
        int capacity = 10;
        int[] weights = { 5, 4, 6, 3 };
        int[] values = { 10, 40, 30, 50 };
        Knapsack knapsack = new Knapsack();
        System.out.println(knapsack.bottomUp(capacity, weights, values));
    }

    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] matrix = new int[weights.length + 1][capacity + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j < weights[i]) {
                    matrix[i + 1][j] = matrix[i][j];
                } else {
                    matrix[i + 1][j] = Math.max(matrix[i][j], matrix[i][j - weights[i]] + values[i]);
                }
            }
        }
        return matrix[weights.length][capacity];
    }
}
