package Copilot.BreadthFirstSearch.T25;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int i = 0; i < adjList[currentVertex].size(); i++) {
                int adjacentVertex = adjList[currentVertex].get(i);
                if (!visited[adjacentVertex]) {
                    visited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                    parent[adjacentVertex] = currentVertex;
                }
            }
        }
        return parent;
    }
}
