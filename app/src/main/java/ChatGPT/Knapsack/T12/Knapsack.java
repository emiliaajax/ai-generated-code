package ChatGPT.Knapsack.T12;

public class Knapsack {
  private int[][] dpTable;

  public int bottomUp(int capacity, int[] weights, int[] values) {
      int n = weights.length;
      dpTable = new int[n+1][capacity+1];

      // Fill the dpTable with 0 for the base cases
      for (int i = 0; i <= n; i++) {
          dpTable[i][0] = 0;
      }
      for (int j = 0; j <= capacity; j++) {
          dpTable[0][j] = 0;
      }

      // Compute the maximum value for each item and capacity using bottom-up DP
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= capacity; j++) {
              if (weights[i-1] > j) {
                  dpTable[i][j] = dpTable[i-1][j];
              } else {
                  dpTable[i][j] = Math.max(dpTable[i-1][j], values[i-1] + dpTable[i-1][j-weights[i-1]]);
              }
          }
      }

      // Return the maximum value
      return dpTable[n][capacity];
  }
}
