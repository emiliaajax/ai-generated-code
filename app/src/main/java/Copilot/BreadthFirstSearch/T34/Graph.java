package Copilot.BreadthFirstSearch.T34;

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

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
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

    public void addEdge(int vertex1, int vertex2) {
        adjList[vertex1].add(vertex2);
        adjList[vertex2].add(vertex1);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println(i + " : " + parent[i]);
        }
    }
}
