package Copilot.BreadthFirstSearch.T17;

import java.util.*;

public class Graph {
int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public int[] bfs(int sourceVertex) {
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            List<Integer> neighbors = adjList.get(currentVertex);
            for (Integer neighbor : neighbors) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    parent[neighbor] = currentVertex;
                }
            }
        }
        return parent;
    }
}
