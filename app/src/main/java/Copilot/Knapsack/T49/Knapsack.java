package Copilot.Knapsack.T49;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[capacity + 1][weights.length + 1];

        for (int i = 0; i <= capacity; i++) {
            for (int j = 0; j <= weights.length; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (weights[j - 1] <= i) {
                    table[i][j] = Math.max(values[j - 1] + table[i - weights[j - 1]][j - 1], table[i][j - 1]);
                } else {
                    table[i][j] = table[i][j - 1];
                }
            }
        }

        return table[capacity][weights.length];
    }
}
