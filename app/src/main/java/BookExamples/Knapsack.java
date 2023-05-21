package BookExamples;

// Source: https://github.com/TrainingByPackt/Data-Structures-and-Algorithms-in-Java/blob/master/src/main/java/com/packt/datastructuresandalg/lesson4/knapsack/Knapsack.java
public class Knapsack {
  public int bottomUp(int weight, int weights[], int values[]) {
    int[][] dp = new int[values.length + 1][weight + 1];
    for (int i = 0; i <= values.length; i++) {
      for (int w = 0; w <= weight; w++) {
        if (i == 0 || w == 0)
          dp[i][w] = 0;
        else if (weights[i - 1] <= w)
          dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
        else
          dp[i][w] = dp[i - 1][w];
      }
    }
    return dp[values.length][weight];
  }
}
