package Copilot.BreadthFirstSearch.T30;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adj[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        LinkedList<Integer> queue = new LinkedList();
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            int currentVertex = queue.poll();
            Iterator<Integer> iterator = adj[currentVertex].listIterator();
            while (iterator.hasNext()) {
                int nextVertex = iterator.next();
                if (parent[nextVertex] == -1) {
                    parent[nextVertex] = currentVertex;
                    queue.add(nextVertex);
                }
            }
        }
        return parent;
    }
}
