package ChatGPT.BreadthFirstSearch.T43;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private List<List<Integer>> adj; // adjacency list

    public Graph(int vertices) {
        this.V = vertices;
        this.adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.offer(sourceVertex);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    parent[v] = u;
                    queue.offer(v);
                }
            }
        }
        return parent;
    }
}
