package Copilot.Knapsack.T7;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] dp = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                int w = weights[i - 1];
                int v = values[i - 1];
                if (w <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], v + dp[i - 1][j - w]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[weights.length][capacity];
    }

    public static void main(String[] args) {
        Knapsack k = new Knapsack();
        int capacity = 5;
        int[] weights = { 1, 2, 3 };
        int[] values = { 6, 10, 12 };
        System.out.println(k.bottomUp(capacity, weights, values));
    }
}
