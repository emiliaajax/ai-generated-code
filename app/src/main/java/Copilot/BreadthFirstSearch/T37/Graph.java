package Copilot.BreadthFirstSearch.T37;

import java.util.*;

public class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbour : adjList[currentVertex]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    parent[neighbour] = currentVertex;
                    queue.add(neighbour);
                }
            }
        }
        return parent;
    }
}
