package ChatGPT.BreadthFirstSearch.T38;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        this.adjacencyList.get(source).add(destination);
        this.adjacencyList.get(destination).add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[vertices];
        Arrays.fill(parents, -1);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        visited[sourceVertex] = true;
        queue.offer(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parents[neighbor] = currentVertex;
                    queue.offer(neighbor);
                }
            }
        }
        return parents;
    }
}
