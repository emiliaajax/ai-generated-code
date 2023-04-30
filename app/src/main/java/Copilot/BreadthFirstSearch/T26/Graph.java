package Copilot.BreadthFirstSearch.T26;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            int v = queue.poll();
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    parent[n] = v;
                    queue.add(n);
                }
            }
        }
        return parent;
    }
}
