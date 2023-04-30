package Copilot.BreadthFirstSearch.T42;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];
    private int parent[];
    private Queue<Integer> queue = new LinkedList<Integer>();
    private boolean visited[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        parent = new int[vertices];
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<Integer>();
            parent[i] = -1;
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            Iterator<Integer> iterator = adjList[vertex].listIterator();
            while (iterator.hasNext()) {
                int adjVertex = iterator.next();
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    parent[adjVertex] = vertex;
                    queue.add(adjVertex);
                }
            }
        }
        return parent;
    }
}
