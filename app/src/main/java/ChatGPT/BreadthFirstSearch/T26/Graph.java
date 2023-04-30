package ChatGPT.BreadthFirstSearch.T26;

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
        int[] parents = new int[V];
        Arrays.fill(parents, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parents[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj.get(u)) {
                if (parents[v] == -1) {
                    parents[v] = u;
                    queue.offer(v);
                }
            }
        }
        return parents;
    }
}
