package Copilot.BreadthFirstSearch.T7;

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
        adjList[destination].add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currentVertex = queue.remove();
            for (int neighbor : adjList[currentVertex]) {
                if (parent[neighbor] == -1) {
                    parent[neighbor] = currentVertex;
                    queue.add(neighbor);
                }
            }
        }
        return parent;
    }
}
