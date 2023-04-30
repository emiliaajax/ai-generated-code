package Copilot.BreadthFirstSearch.T10;

import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<Integer> edges;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<Integer>();
    }

    public void addEdge(int u, int v) {
        edges.add(u);
        edges.add(v);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            for (int i = 0; i < edges.size(); i += 2) {
                if (edges.get(i) == vertex) {
                    if (parent[edges.get(i + 1)] == -1) {
                        queue.add(edges.get(i + 1));
                        parent[edges.get(i + 1)] = vertex;
                    }
                } else if (edges.get(i + 1) == vertex) {
                    if (parent[edges.get(i)] == -1) {
                        queue.add(edges.get(i));
                        parent[edges.get(i)] = vertex;
                    }
                }
            }
        }
        return parent;
    }
}

