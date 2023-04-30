package Copilot.BreadthFirstSearch.T48;

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
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        while (queue.size() != 0) {
            sourceVertex = queue.poll();
            Iterator<Integer> iterator = adjList[sourceVertex].listIterator();
            while (iterator.hasNext()) {
                int destinationVertex = iterator.next();
                if (!visited[destinationVertex]) {
                    visited[destinationVertex] = true;
                    queue.add(destinationVertex);
                    parent[destinationVertex] = sourceVertex;
                }
            }
        }
        return parent;
    }
}
