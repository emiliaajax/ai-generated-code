package Copilot.Knapsack.T32;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[weights.length][capacity + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0) {
                    if (j >= weights[i]) {
                        table[i][j] = values[i];
                    } else {
                        table[i][j] = 0;
                    }
                } else {
                    if (j >= weights[i]) {
                        table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weights[i]] + values[i]);
                    } else {
                        table[i][j] = table[i - 1][j];
                    }
                }
            }
        }
        return table[weights.length - 1][capacity];
    }
}
