package ChatGPT.BreadthFirstSearch.T44;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private List<List<Integer>> adj; // adjacency list

    public Graph(int vertices) {
        V = vertices;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public int[] bfs(int sourceVertex) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }

        return parent;
    }
}
