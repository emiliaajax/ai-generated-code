package Copilot.Knapsack.T30;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[capacity + 1][weights.length + 1];
        for (int i = 1; i <= capacity; i++) {
            for (int j = 1; j <= weights.length; j++) {
                int notTaking = table[i][j - 1];
                int taking = 0;
                if (weights[j - 1] <= i) {
                    taking = table[i - weights[j - 1]][j - 1] + values[j - 1];
                }
                table[i][j] = Math.max(notTaking, taking);
            }
        }
        return table[capacity][weights.length];
    }
}
