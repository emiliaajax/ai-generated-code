package ChatGPT.Knapsack.T18;

public class Knapsack {

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      int[][] dp = new int[n+1][capacity+1];

      for (int i = 1; i <= n; i++) {
          for (int w = 1; w <= capacity; w++) {
              if (weights[i-1] <= w) {
                  dp[i][w] = Math.max(values[i-1] + dp[i-1][w-weights[i-1]], dp[i-1][w]);
              } else {
                  dp[i][w] = dp[i-1][w];
              }
          }
      }

      return dp[n][capacity];
  }
}
