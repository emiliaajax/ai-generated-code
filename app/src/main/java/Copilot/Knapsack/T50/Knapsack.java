package Copilot.Knapsack.T50;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        int[][] T = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    T[i][j] = Math.max(T[i - 1][j], values[i - 1] + T[i - 1][j - weights[i - 1]]);
                } else {
                    T[i][j] = T[i - 1][j];
                }
            }
        }

        return T[n][capacity];
    }
}
