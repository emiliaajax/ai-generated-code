package Copilot.Knapsack.T6;

public class Knapsack {
    private int capacity;
    private int[] weights;
    private int[] values;
    private int[][] table;

    public Knapsack(int capacity, int[] weights, int[] values) {
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.table = new int[weights.length + 1][capacity + 1];
    }

    public int bottomUp() {
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < capacity; j++) {
                if (weights[i] > j) {
                    table[i + 1][j + 1] = table[i][j + 1];
                } else {
                    table[i + 1][j + 1] = Math.max(table[i][j + 1], table[i][j - weights[i] + 1] + values[i]);
                }
            }
        }
        return table[weights.length][capacity];
    }
}
