package Copilot.BreadthFirstSearch.T35;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int dest) {
        adjList[source].add(dest);
    }

    public int[] bfs(int sourceVertex) {
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    queue.add(neighbor);
                }
            }
        }
        return parent;
    }
}
