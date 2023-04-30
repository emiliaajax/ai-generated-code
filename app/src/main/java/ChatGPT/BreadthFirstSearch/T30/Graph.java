package ChatGPT.BreadthFirstSearch.T30;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adj;
    
    public Graph(int vertices) {
        this.vertices = vertices;
        this.adj = new ArrayList[vertices];
        
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    
    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int neighbor : adj[curr]) {
                if (parent[neighbor] == -1) {
                    parent[neighbor] = curr;
                    queue.offer(neighbor);
                }
            }
        }
        
        return parent;
    }
}
