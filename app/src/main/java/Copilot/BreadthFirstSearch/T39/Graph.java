package Copilot.BreadthFirstSearch.T39;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];
    private int parent[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        parent = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
            parent[i] = -1;
        }
    }

    public void addEdge(int sourceVertex, int destinationVertex) {
        adjList[sourceVertex].add(destinationVertex);
    }

    public int[] bfs(int sourceVertex) {
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (queue.size() != 0) {
            sourceVertex = queue.poll();
            System.out.print(sourceVertex + " ");

            for (int i = 0; i < adjList[sourceVertex].size(); i++) {
                int vertex = adjList[sourceVertex].get(i);
                if (!visited[vertex]) {
                    visited[vertex] = true;
                    queue.add(vertex);
                    parent[vertex] = sourceVertex;
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
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        graph.bfs(0);
    }
}
