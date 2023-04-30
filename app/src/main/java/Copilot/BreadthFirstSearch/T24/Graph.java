package Copilot.BreadthFirstSearch.T24;

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
        adjList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int i = 0; i < adjList[currentVertex].size(); i++) {
                int adjVertex = adjList[currentVertex].get(i);
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                    parent[adjVertex] = currentVertex;
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
            System.out.println(i + " - " + parent[i]);
        }
    }
}
