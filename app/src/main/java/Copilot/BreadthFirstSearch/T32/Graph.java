package Copilot.BreadthFirstSearch.T32;

import java.util.*;

public class Graph {
    private final int vertices;
    private LinkedList<Integer> adjListArray[];

    // constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];

        // Create a new list for each vertex
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    // Adds an edge to an undirected graph
    public void addEdge(int src, int dest) {
        // Add an edge from src to dest.
        adjListArray[src].add(dest);

        // Since graph is undirected, add an edge from dest
        // to src also
        adjListArray[dest].add(src);
    }

    // Prints the BFS traversal from a given source s
    public int[] bfs(int sourceVertex) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[vertices];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        // Create an array to store parent nodes
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            sourceVertex = queue.poll();

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adjListArray[sourceVertex].listIterator();
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
