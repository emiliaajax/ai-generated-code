package ChatGPT.BreadthFirstSearch.T39;

import java.util.*;

import java.util.*;

public class Graph {
    private int vertices; // number of vertices in the graph
    private List<List<Integer>> adjacencyList; // adjacency list representation of the graph

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1); // initialize all parent nodes to -1
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
