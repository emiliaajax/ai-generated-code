package ChatGPT.BreadthFirstSearch.T46;

import java.util.*;

public class Graph {
    private final int vertices;
    private final List<Integer>[] adj;
    
    public Graph(int vertices) {
        this.vertices = vertices;
        this.adj = new List[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // if undirected graph
    }
    
    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1); // initialize parent nodes to -1
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj[u]) {
                if (parent[v] == -1) { // if v is unvisited
                    parent[v] = u;
                    queue.offer(v);
                }
            }
        }
        return parent;
    }
}
