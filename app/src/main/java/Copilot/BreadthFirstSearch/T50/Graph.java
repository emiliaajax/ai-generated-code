package Copilot.BreadthFirstSearch.T50;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];
    private boolean visited[];
    private int parent[];
    private Queue<Integer> queue;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        queue = new LinkedList<>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        parent[sourceVertex] = -1;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList[u]) {
                if (!visited[v]) {
                    queue.add(v);
                    visited[v] = true;
                    parent[v] = u;
                }
            }
        }
        return parent;
    }
}
