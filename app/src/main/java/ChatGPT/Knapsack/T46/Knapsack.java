package ChatGPT.Knapsack.T46;

public class Knapsack {
  private int[][] memo;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      memo = new int[n + 1][capacity + 1];

      for (int i = 1; i <= n; i++) {
          for (int j = 0; j <= capacity; j++) {
              if (weights[i - 1] <= j) {
                  memo[i][j] = Math.max(memo[i - 1][j], values[i - 1] + memo[i - 1][j - weights[i - 1]]);
              } else {
                  memo[i][j] = memo[i - 1][j];
              }
          }
      }

      return memo[n][capacity];
  }
}
