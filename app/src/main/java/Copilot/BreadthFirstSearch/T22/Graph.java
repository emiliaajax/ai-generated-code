package Copilot.BreadthFirstSearch.T22;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adjList;
    private boolean[] visited;
    private int[] parent;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];
        visited = new boolean[vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
            parent[i] = -1;
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public int[] bfs(int sourceVertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            List<Integer> neighbors = adjList[currentVertex];
            for (int i = 0; i < neighbors.size(); i++) {
                int neighbor = neighbors.get(i);
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    parent[neighbor] = currentVertex;
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
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.bfs(0);
    }
}
