package ChatGPT.Knapsack.T25;

public class Knapsack {
  private int[][] memo;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      memo = new int[n + 1][capacity + 1];

      // fill the memo table
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= capacity; j++) {
              if (weights[i - 1] > j) {
                  memo[i][j] = memo[i - 1][j];
              } else {
                  memo[i][j] = Math.max(memo[i - 1][j], memo[i - 1][j - weights[i - 1]] + values[i - 1]);
              }
          }
      }

      // return the maximum value
      return memo[n][capacity];
  }
}
