package Copilot.BreadthFirstSearch.T19;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];
    private int[] parent;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<Integer>();
            parent[i] = -1;
        }
    }

    public void addEdge(int sourceVertex, int destinationVertex) {
        adjList[sourceVertex].add(destinationVertex);
        adjList[destinationVertex].add(sourceVertex);
    }

    public int[] bfs(int sourceVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            for (int i = 0; i < adjList[vertex].size(); i++) {
                int adjVertex = adjList[vertex].get(i);
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                    parent[adjVertex] = vertex;
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("Parent of " + i + " is " + parent[i]);
        }
    }
}
