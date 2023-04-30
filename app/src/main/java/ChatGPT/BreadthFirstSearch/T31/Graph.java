package ChatGPT.BreadthFirstSearch.T31;

import java.util.*;

public class Graph {
    private final int V; // number of vertices
    private final List<Integer>[] adj; // adjacency lists

    public Graph(int V) {
        this.V = V;
        adj = new List[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public int[] bfs(int source) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<Integer>();
        parent[source] = source;
        queue.add(source);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : adj[v]) {
                if (parent[w] == -1) {
                    parent[w] = v;
                    queue.add(w);
                }
            }
        }
        return parent;
    }
}
