package ChatGPT.Knapsack.T40;

public class Knapsack {

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      int[][] dp = new int[n + 1][capacity + 1];

      for (int i = 1; i <= n; i++) {
          int w = weights[i - 1];
          int v = values[i - 1];

          for (int j = 1; j <= capacity; j++) {
              if (w > j) {
                  dp[i][j] = dp[i - 1][j];
              } else {
                  dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
              }
          }
      }

      return dp[n][capacity];
  }
}
