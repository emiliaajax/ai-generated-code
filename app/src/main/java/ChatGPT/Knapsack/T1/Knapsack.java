package ChatGPT.Knapsack.T1;

public class Knapsack {
  private int[][] memo;
  private int[] weights;
  private int[] values;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      this.weights = weights;
      this.values = values;
      this.memo = new int[weights.length + 1][capacity + 1];

      for (int i = 1; i <= weights.length; i++) {
          for (int j = 0; j <= capacity; j++) {
              if (weights[i - 1] > j) {
                  memo[i][j] = memo[i - 1][j];
              } else {
                  memo[i][j] = Math.max(memo[i - 1][j], memo[i - 1][j - weights[i - 1]] + values[i - 1]);
              }
          }
      }

      return memo[weights.length][capacity];
  }
}

