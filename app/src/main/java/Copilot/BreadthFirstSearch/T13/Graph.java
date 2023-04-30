package Copilot.BreadthFirstSearch.T13;

import java.util.*;

public class Graph {
    // Create an adjacency list for the graph
    private LinkedList<Integer>[] adjacencyList;
    // Create a variable to store the number of vertices in the graph
    private int vertices;

    // Create a constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        // Initialize the adjacency list for each vertex
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {
        // Add an edge from source to destination
        adjacencyList[source].addFirst(destination);
        // Add an edge from destination to source
        adjacencyList[destination].addFirst(source);
    }

    // Breadth first search
    public int[] bfs(int sourceVertex) {
        // Create a boolean array to store the visited vertices
        boolean[] visited = new boolean[vertices];
        // Create a queue for the breadth first search
        LinkedList<Integer> queue = new LinkedList<Integer>();
        // Create an array to store the parent nodes
        int[] parent = new int[vertices];
        // Initialize the parent array to -1
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        // Mark the current node as visited and enqueue it
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue and print it
            sourceVertex = queue.poll();
            // Get all adjacent vertices of the dequeued vertex s. If a adjacent has not
            // been visited, then mark it visited and enqueue it
            Iterator<Integer> i = adjacencyList[sourceVertex].listIterator();
            while (i.hasNext()) {
                int n = i.next();
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
