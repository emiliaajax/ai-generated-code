package ChatGPT.Knapsack.T10;

public class Knapsack {
  private int[][] dp;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      dp = new int[n + 1][capacity + 1];

      // Initialize the first row and column to 0
      for (int i = 0; i <= n; i++) {
          dp[i][0] = 0;
      }
      for (int j = 0; j <= capacity; j++) {
          dp[0][j] = 0;
      }

      // Build the dp table bottom-up
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= capacity; j++) {
              if (weights[i-1] <= j) {
                  dp[i][j] = Math.max(dp[i-1][j], values[i-1] + dp[i-1][j-weights[i-1]]);
              } else {
                  dp[i][j] = dp[i-1][j];
              }
          }
      }

      // Return the maximum value
      return dp[n][capacity];
  }
}
