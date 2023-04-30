package ChatGPT.BreadthFirstSearch.T1;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list
    
    public Graph(int vertices) {
        V = vertices;
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
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currVertex = queue.poll();
            for (int neighbor : adj[currVertex]) {
                if (parent[neighbor] == -1) {
                    parent[neighbor] = currVertex;
                    queue.add(neighbor);
                }
            }
        }
        return parent;
    }
}
