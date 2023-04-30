package Copilot.BreadthFirstSearch.T6;

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

    public void addEdge(int sourceVertex, int destinationVertex) {
        adjList[sourceVertex].add(destinationVertex);
        adjList[destinationVertex].add(sourceVertex);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.remove();
            for (int i = 0; i < adjList[currentVertex].size(); i++) {
                int temp = adjList[currentVertex].get(i);
                if (!visited[temp]) {
                    visited[temp] = true;
                    queue.add(temp);
                    parent[temp] = currentVertex;
                }
            }
        }
        return parent;
    }
}
