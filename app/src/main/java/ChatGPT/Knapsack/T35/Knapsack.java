package ChatGPT.Knapsack.T35;

public class Knapsack {
  private int[][] memo;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      memo = new int[n + 1][capacity + 1];

      for (int i = 1; i <= n; i++) {
          int w = weights[i - 1];
          int v = values[i - 1];
          for (int j = 1; j <= capacity; j++) {
              if (w > j) {
                  memo[i][j] = memo[i - 1][j];
              } else {
                  memo[i][j] = Math.max(memo[i - 1][j], v + memo[i - 1][j - w]);
              }
          }
      }

      return memo[n][capacity];
  }
}
