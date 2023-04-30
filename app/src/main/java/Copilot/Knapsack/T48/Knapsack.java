package Copilot.Knapsack.T48;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        int[][] M = new int[n + 1][capacity + 1];
        for (int i = 0; i <= capacity; i++) {
            M[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j >= weights[i - 1]) {
                    M[i][j] = Math.max(M[i - 1][j], M[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    M[i][j] = M[i - 1][j];
                }
            }
        }
        return M[n][capacity];
    }
}
