package Copilot.BreadthFirstSearch.T33;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            sourceVertex = queue.poll();
            Iterator<Integer> iterator = adjacencyList[sourceVertex].listIterator();
            while (iterator.hasNext()) {
                int n = iterator.next();
                if (!visited[n]) {
                    visited[n] = true;
                    parent[n] = sourceVertex;
                    queue.add(n);
                }
            }
        }
        return parent;
    }
}
