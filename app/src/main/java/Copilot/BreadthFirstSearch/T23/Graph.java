package Copilot.BreadthFirstSearch.T23;

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

    public void addEdge(int source, int destination) {
        adjList[source].addFirst(destination);
        adjList[destination].addFirst(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            int vertex = queue.poll();
            Iterator<Integer> it = adjList[vertex].listIterator();
            while (it.hasNext()) {
                int adjVertex = it.next();
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                    parent[adjVertex] = vertex;
                }
            }
        }
        return parent;
    }
}
