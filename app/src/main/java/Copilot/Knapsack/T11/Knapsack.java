package Copilot.Knapsack.T11;

public class Knapsack {
    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        return table[weights.length][capacity];
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        int[] weights = { 1, 2, 3, 2 };
        int[] values = { 8, 4, 0, 5 };
        int capacity = 5;
        System.out.println(knapsack.bottomUp(capacity, weights, values));
    }
}
