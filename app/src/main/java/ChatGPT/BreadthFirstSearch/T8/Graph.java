package ChatGPT.BreadthFirstSearch.T8;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list

    public Graph(int V) {
        this.V = V;
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
        for (int i = 0; i < V; i++) {
            parent[i] = -1;
        }
        parent[sourceVertex] = sourceVertex;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);

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
