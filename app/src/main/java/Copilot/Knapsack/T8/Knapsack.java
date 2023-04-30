package Copilot.Knapsack.T8;

public class Knapsack {
    int capacity;
    int[] weights;
    int[] values;
    int[][] table;

    public Knapsack(int capacity, int[] weights, int[] values) {
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        table = new int[capacity + 1][weights.length + 1];
    }

    public int bottomUp(int capacity, int[] weights, int[] values) {
        for (int i = 1; i <= capacity; i++) {
            for (int j = 1; j <= weights.length; j++) {
                if (weights[j - 1] <= i) {
                    table[i][j] = Math.max(values[j - 1] + table[i - weights[j - 1]][j - 1], table[i][j - 1]);
                } else {
                    table[i][j] = table[i][j - 1];
                }
            }
        }
        return table[capacity][weights.length];
    }

    public static void main(String[] args) {
        int capacity = 50;
        int[] weights = { 10, 20, 30 };
        int[] values = { 60, 100, 120 };
        Knapsack knapsack = new Knapsack(capacity, weights, values);
        System.out.println(knapsack.bottomUp(capacity, weights, values));
    }
}
