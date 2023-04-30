package ChatGPT.BreadthFirstSearch.T33;

import java.util.*;

public class Graph {
    private int V;
    private List<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[V];
        Arrays.fill(parents, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parents[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj[u]) {
                if (parents[v] == -1) {
                    parents[v] = u;
                    queue.add(v);
                }
            }
        }
        return parents;
    }
}
