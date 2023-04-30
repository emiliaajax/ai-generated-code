package Copilot.Knapsack.T26;

public class Knapsack {
    private int capacity;
    private int[] weights;
    private int[] values;
    private int[][] matrix;
    private int[][] items;

    public Knapsack(int capacity, int[] weights, int[] values) {
        this.capacity = capacity;
        this.weights = weights;
        this.values = values;
        this.matrix = new int[weights.length + 1][capacity + 1];
        this.items = new int[weights.length + 1][capacity + 1];
    }

    public int bottomUp(int capacity, int[] weights, int[] values) {
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j < weights[i - 1]) {
                    matrix[i][j] = matrix[i - 1][j];
                    items[i][j] = items[i - 1][j];
                } else {
                    int value = values[i - 1] + matrix[i - 1][j - weights[i - 1]];
                    if (value > matrix[i - 1][j]) {
                        matrix[i][j] = value;
                        items[i][j] = 1;
                    } else {
                        matrix[i][j] = matrix[i - 1][j];
                        items[i][j] = items[i - 1][j];
                    }
                }
            }
        }
        return matrix[weights.length][capacity];
    }

    public void printItems() {
        int i = weights.length;
        int j = capacity;
        while (i > 0 && j > 0) {
            if (items[i][j] == 1) {
                System.out.println("Item " + i + " is in the knapsack.");
                j = j - weights[i - 1];
            }
            i--;
        }
    }

    public static void main(String[] args) {
        int capacity = 10;
        int[] weights = new int[] { 3, 4, 2 };
        int[] values = new int[] { 4, 5, 3 };
        Knapsack knapsack = new Knapsack(capacity, weights, values);
        System.out.println(knapsack.bottomUp(capacity, weights, values));
        knapsack.printItems();
    }
}
