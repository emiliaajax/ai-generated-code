package ChatGPT.BreadthFirstSearch.T48;

import java.util.*;

public class Graph {
    private int V;
    private List<List<Integer>> adj;
    
    public Graph(int vertices) {
        V = vertices;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; ++i)
            adj.add(new LinkedList<Integer>());
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
