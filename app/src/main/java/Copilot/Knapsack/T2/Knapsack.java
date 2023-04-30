package Copilot.Knapsack.T2;

public class Knapsack {
    private int capacity;
    private int[] weights;
    private int[] values;

    public Knapsack(int capacity, int[] weights, int[] values) {
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
    }

    public int bottomUp(int capacity, int[] weights, int[] values) {
        int[][] table = new int[weights.length + 1][capacity + 1];
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                if (weights[i - 1] <= j) {
                    table[i][j] = Math.max(values[i - 1] + table[i - 1][j - weights[i - 1]], table[i - 1][j]);
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
        return table[weights.length][capacity];
    }
}
