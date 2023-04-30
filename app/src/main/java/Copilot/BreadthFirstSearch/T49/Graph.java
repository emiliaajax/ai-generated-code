package Copilot.BreadthFirstSearch.T49;

import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<Integer>[] adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int sourceVertex, int destinationVertex) {
        adj[sourceVertex].add(destinationVertex);
        adj[destinationVertex].add(sourceVertex);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbour : adj[currentVertex]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = currentVertex;
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("Parent of " + i + " is " + parent[i]);
        }
    }
}
