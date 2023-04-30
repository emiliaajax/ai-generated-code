package Copilot.BreadthFirstSearch.T8;

import java.util.*;

public class Graph {
    int vertices;
    LinkedList<Integer> adjListArray[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
        adjListArray[dest].add(src);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            Iterator<Integer> i = adjListArray[currentVertex].listIterator();
            while (i.hasNext()) {
                int vertex = i.next();
                if (!visited[vertex]) {
                    visited[vertex] = true;
                    parent[vertex] = currentVertex;
                    queue.add(vertex);
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
        graph.bfs(0);
    }
}
