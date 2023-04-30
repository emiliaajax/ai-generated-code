package Copilot.BreadthFirstSearch.T38;

import java.util.*;

public class Graph {
    private int vertices;
    private int[][] edges;
    private int[] parent;

    public Graph(int vertices) {
        this.vertices = vertices;
        edges = new int[vertices][vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
    }

    public void addEdge(int source, int destination) {
        edges[source][destination] = 1;
        edges[destination][source] = 1;
    }

    public int[] bfs(int sourceVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        while (queue.size() != 0) {
            int vertex = queue.poll();
            for (int i = 0; i < vertices; i++) {
                if (edges[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    parent[i] = vertex;
                }
            }
        }
        return parent;
    }
}
