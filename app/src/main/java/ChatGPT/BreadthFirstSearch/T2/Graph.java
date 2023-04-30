package ChatGPT.BreadthFirstSearch.T2;

import java.util.*;

public class Graph {
    private int V; // number of vertices in the graph
    private LinkedList<Integer>[] adj; // adjacency list for the graph

    public Graph(int vertices) {
        V = vertices;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
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
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adj[currentVertex]) {
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
