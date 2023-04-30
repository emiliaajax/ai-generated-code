package ChatGPT.Knapsack.T30;

public class Knapsack {
  private int capacity;
  private int[] weights;
  private int[] values;
  private int[][] memo;

  public Knapsack(int capacity, int[] weights, int[] values) {
      this.capacity = capacity;
      this.weights = weights;
      this.values = values;
      this.memo = new int[weights.length + 1][capacity + 1];
  }

  public int bottomUp() {
      for (int i = 1; i <= weights.length; i++) {
          for (int j = 1; j <= capacity; j++) {
              int withoutItem = memo[i - 1][j];
              int withItem = 0;
              if (j >= weights[i - 1]) {
                  withItem = memo[i - 1][j - weights[i - 1]] + values[i - 1];
              }
              memo[i][j] = Math.max(withoutItem, withItem);
          }
      }
      return memo[weights.length][capacity];
  }
}
