package Copilot.BreadthFirstSearch.T29;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<Integer>();
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
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                    parent[v] = u;
                }
            }
        }
        return parent;
    }
}
