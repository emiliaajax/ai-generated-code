package Copilot.BreadthFirstSearch.T11;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adj;
    private boolean[] visited;
    private int[] parent;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new List[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        visited = new boolean[vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public int[] bfs(int sourceVertex) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        while (!queue.isEmpty()) {
            int current = queue.remove();
            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                }
            }
        }
        return parent;
    }
}
