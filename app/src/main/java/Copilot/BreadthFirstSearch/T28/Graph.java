package Copilot.BreadthFirstSearch.T28;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++)
            adjacencyList[i] = new LinkedList();
    }

    public void addEdge(int vertex, int edge) {
        adjacencyList[vertex].add(edge);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        for (int i = 0; i < parentNodes.length; i++)
            parentNodes[i] = -1;
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            sourceVertex = queue.poll();
            Iterator<Integer> i = adjacencyList[sourceVertex].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    parentNodes[n] = sourceVertex;
                    queue.add(n);
                }
            }
        }
        return parentNodes;
    }
}
