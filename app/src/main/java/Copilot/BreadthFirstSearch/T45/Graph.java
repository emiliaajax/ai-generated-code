package Copilot.BreadthFirstSearch.T45;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            for (int i = 0; i < adjList[vertex].size(); i++) {
                int adjacentVertex = adjList[vertex].get(i);
                if (!visited[adjacentVertex]) {
                    visited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                    parent[adjacentVertex] = vertex;
                }
            }
        }
        return parent;
    }
}
