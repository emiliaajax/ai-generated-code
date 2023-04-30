package Copilot.BreadthFirstSearch.T41;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adj[];
    private boolean visited[];
    private int parent[];
    private int distance[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        visited = new boolean[vertices];
        parent = new int[vertices];
        distance = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adj[src].add(dest);
    }

    public int[] bfs(int sourceVertex) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        parent[sourceVertex] = -1;
        distance[sourceVertex] = 0;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            for (int adjVertex : adj[vertex]) {
                if (!visited[adjVertex]) {
                    queue.add(adjVertex);
                    visited[adjVertex] = true;
                    parent[adjVertex] = vertex;
                    distance[adjVertex] = distance[vertex] + 1;
                }
            }
        }
        return parent;
    }
}
