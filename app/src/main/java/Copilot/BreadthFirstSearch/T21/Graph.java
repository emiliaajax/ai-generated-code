package Copilot.BreadthFirstSearch.T21;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adj[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    public int[] bfs(int source) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            for (Integer adjacent : adj[vertex]) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    queue.add(adjacent);
                    parent[adjacent] = vertex;
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(8);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(6, 7);

        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("Parent of " + i + " is " + parent[i]);
        }
    }
}
