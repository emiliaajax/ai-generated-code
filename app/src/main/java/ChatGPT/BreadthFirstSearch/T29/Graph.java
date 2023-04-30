package ChatGPT.BreadthFirstSearch.T29;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = currentVertex;
                    queue.add(neighbor);
                }
            }
        }
        return parent;
    }
}
