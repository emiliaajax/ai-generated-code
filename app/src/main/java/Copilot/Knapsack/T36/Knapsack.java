package Copilot.Knapsack.T36;

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
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int capacity = 50;
        int[] weights = new int[] { 10, 20, 30 };
        int[] values = new int[] { 60, 100, 120 };
        Knapsack knapsack = new Knapsack(capacity, weights, values);
        System.out.println(knapsack.bottomUp(capacity, weights, values));
    }
}
