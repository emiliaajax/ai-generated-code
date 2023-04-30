package ChatGPT.BreadthFirstSearch.T27;

import java.util.*;

public class Graph {
    private int vertices;
    private HashMap<Integer, List<Integer>> adjacencyList;
    
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
    }
    
    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u); // if the graph is undirected
    }
    
    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjacencyList.get(u)) {
                if (parent[v] == -1) {
                    parent[v] = u;
                    queue.offer(v);
                }
            }
        }
        return parent;
    }
}
