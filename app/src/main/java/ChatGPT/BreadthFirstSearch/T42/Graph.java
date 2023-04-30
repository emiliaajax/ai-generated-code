package ChatGPT.BreadthFirstSearch.T42;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list

    public Graph(int vertices) {
        V = vertices;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    parent[neighbor] = current;
                }
            }
        }

        return parent;
    }
}
