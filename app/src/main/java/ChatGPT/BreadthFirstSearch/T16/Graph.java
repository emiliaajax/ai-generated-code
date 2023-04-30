package ChatGPT.BreadthFirstSearch.T16;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private ArrayList<Integer>[] adj; // adjacency list
    
    public Graph(int vertices) {
        V = vertices;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    
    public int[] bfs(int sourceVertex) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int neighbor : adj[curr]) {
                if (parent[neighbor] == -1) {
                    q.add(neighbor);
                    parent[neighbor] = curr;
                }
            }
        }
        return parent;
    }
}
