package ChatGPT.Knapsack.T45;

public class Knapsack {
  private int[][] dp;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      dp = new int[n+1][capacity+1];

      // Fill the table in bottom-up manner
      for (int i = 1; i <= n; i++) {
          for (int w = 1; w <= capacity; w++) {
              if (weights[i-1] <= w) {
                  dp[i][w] = Math.max(values[i-1] + dp[i-1][w-weights[i-1]], dp[i-1][w]);
              } else {
                  dp[i][w] = dp[i-1][w];
              }
          }
      }

      // Return the maximum value
      return dp[n][capacity];
  }
}
