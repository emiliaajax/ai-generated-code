package ChatGPT.Knapsack.T36;

public class Knapsack {
  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      int[][] dp = new int[n + 1][capacity + 1];
      
      for (int i = 1; i <= n; i++) {
          int weight = weights[i - 1];
          int value = values[i - 1];
          for (int j = 0; j <= capacity; j++) {
              if (weight > j) {
                  dp[i][j] = dp[i - 1][j];
              } else {
                  dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight] + value);
              }
          }
      }
      
      return dp[n][capacity];
  }
}
