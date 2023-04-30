package ChatGPT.Knapsack.T44;

public class Knapsack {
  private int[][] memo;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      memo = new int[n + 1][capacity + 1];
      
      for (int i = 0; i <= n; i++) {
          for (int j = 0; j <= capacity; j++) {
              if (i == 0 || j == 0) {
                  memo[i][j] = 0;
              } else if (weights[i - 1] <= j) {
                  memo[i][j] = Math.max(values[i - 1] + memo[i - 1][j - weights[i - 1]], memo[i - 1][j]);
              } else {
                  memo[i][j] = memo[i - 1][j];
              }
          }
      }

      return memo[n][capacity];
  }
}
