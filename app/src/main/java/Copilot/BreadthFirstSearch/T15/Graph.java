package Copilot.BreadthFirstSearch.T15;

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
        adjList[source].addFirst(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int i = 0; i < adjList[currentVertex].size(); i++) {
                int adjVertex = adjList[currentVertex].get(i);
                if (parent[adjVertex] == -1) {
                    parent[adjVertex] = currentVertex;
                    queue.add(adjVertex);
                }
            }
        }
        return parent;
    }
}
