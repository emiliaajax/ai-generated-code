package Copilot.Knapsack.T28;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[0].length; j++) {
                if (weights[i - 1] > j) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }
        return table[weights.length][capacity];
    }
}
