package Copilot.BreadthFirstSearch.T12;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjListArray[];
    private int[] parent;
    private boolean[] visited;
    private Queue<Integer> queue;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];
        parent = new int[vertices];
        visited = new boolean[vertices];
        queue = new LinkedList<Integer>();
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
        adjListArray[dest].add(src);
    }

    public int[] bfs(int sourceVertex) {
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            sourceVertex = queue.poll();
            for (int i = 0; i < adjListArray[sourceVertex].size(); i++) {
                int adjVertex = adjListArray[sourceVertex].get(i);
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                    parent[adjVertex] = sourceVertex;
                }
            }
        }
        return parent;
    }

    public static void main(String args[]) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(3, 8);
        graph.addEdge(4, 9);
        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("parent of " + i + " is " + parent[i]);
        }
    }
}
