package Copilot.Knapsack.T43;

public class Knapsack {
    // Implement the bottomUp method.
    public int bottomUp(int capacity, int[] weights, int[] values) {
        // Create a new int array named dp with capacity + 1 elements.
        int[] dp = new int[capacity + 1];
        // For each item i in the array of weights.
        for (int i = 0; i < weights.length; i++) {
            // For each weight j from capacity to weights[i] (inclusive).
            for (int j = capacity; j >= weights[i]; j--) {
                // Set dp[j] to the maximum of dp[j] and dp[j - weights[i]] + values[i].
                dp[j] = Math.max(dp[j], dp[j - weights[i]] + values[i]);
            }
        }
        // Return dp[capacity].
        return dp[capacity];
    }
}
