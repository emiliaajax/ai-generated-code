package ChatGPT.BreadthFirstSearch.T25;

import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parent[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adjacencyList.get(current)) {
                if (parent[neighbor] == -1) {
                    parent[neighbor] = current;
                    queue.offer(neighbor);
                }
            }
        }

        return parent;
    }
}
