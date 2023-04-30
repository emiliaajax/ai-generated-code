package ChatGPT.Knapsack.T24;

public class Knapsack {
  private int[][] dpTable;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      dpTable = new int[n + 1][capacity + 1];

      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= capacity; j++) {
              if (weights[i-1] <= j) {
                  dpTable[i][j] = Math.max(values[i-1] + dpTable[i-1][j-weights[i-1]], dpTable[i-1][j]);
              } else {
                  dpTable[i][j] = dpTable[i-1][j];
              }
          }
      }

      return dpTable[n][capacity];
  }
}
