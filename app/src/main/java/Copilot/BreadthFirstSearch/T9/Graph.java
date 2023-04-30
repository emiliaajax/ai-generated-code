package Copilot.BreadthFirstSearch.T9;

import java.util.*;

public class Graph {
    int vertices;
    ArrayList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
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
            int current = queue.poll();
            for (int neighbour : adjList[current]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = current;
                }
            }
        }
        return parent;
    }
}

