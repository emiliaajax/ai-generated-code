package Copilot.Knapsack.T14;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[values.length + 1][capacity + 1];
        for (int i = 1; i <= values.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], values[i - 1] + table[i - 1][j - weights[i - 1]]);
                }
            }
        }
        return table[values.length][capacity];
    }
}
