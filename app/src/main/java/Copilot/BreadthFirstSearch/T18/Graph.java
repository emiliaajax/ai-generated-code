package Copilot.BreadthFirstSearch.T18;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjListArray[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.println("Visited " + currentVertex);
            for (int i = 0; i < adjListArray[currentVertex].size(); i++) {
                int adjVertex = adjListArray[currentVertex].get(i);
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
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("Parent of " + i + " is " + parent[i]);
        }
    }
}
