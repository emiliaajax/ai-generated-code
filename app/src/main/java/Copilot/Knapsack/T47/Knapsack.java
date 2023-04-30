package Copilot.Knapsack.T47;

public class Knapsack {
    private int capacity;
    private int[] weights;
    private int[] values;
    private int[][] knapsack;

    public Knapsack(int capacity, int[] weights, int[] values) {
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.knapsack = new int[weights.length + 1][capacity + 1];
    }

    public int bottomUp() {
        for (int i = 1; i < knapsack.length; i++) {
            for (int j = 0; j < knapsack[i].length; j++) {
                if (weights[i - 1] <= j) {
                    knapsack[i][j] = Math.max(knapsack[i - 1][j], knapsack[i - 1][j - weights[i - 1]] + values[i - 1]);
                } else {
                    knapsack[i][j] = knapsack[i - 1][j];
                }
            }
        }
        return knapsack[knapsack.length - 1][knapsack[0].length - 1];
    }
}
