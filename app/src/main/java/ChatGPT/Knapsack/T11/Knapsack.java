package ChatGPT.Knapsack.T11;

public class Knapsack {
    
  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      int[][] dp = new int[n+1][capacity+1];
      
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= capacity; j++) {
              if (weights[i-1] > j) {
                  dp[i][j] = dp[i-1][j];
              } else {
                  dp[i][j] = Math.max(dp[i-1][j], values[i-1] + dp[i-1][j-weights[i-1]]);
              }
          }
      }
      
      return dp[n][capacity];
  }
}
