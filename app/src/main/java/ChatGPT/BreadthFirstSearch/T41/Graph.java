package ChatGPT.BreadthFirstSearch.T41;

import java.util.*;

public class Graph {
    private int V;
    private List<Integer>[] adj;
    
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
        parent[sourceVertex] = sourceVertex;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);
        
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj[u]) {
                if (parent[v] == -1) {
                    parent[v] = u;
                    queue.add(v);
                }
            }
        }
        
        return parent;
    }
}
