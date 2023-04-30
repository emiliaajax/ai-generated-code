package Copilot.BreadthFirstSearch.T4;

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

    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = -1;
        }
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            Iterator<Integer> it = adj[current].iterator();
            while (it.hasNext()) {
                int next = it.next();
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = current;
                    queue.add(next);
                }
            }
        }
        return parent;
    }

    public static void main(String args[]) {
        Graph g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(5, 6);
        g.addEdge(6, 7);
        int[] parent = g.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.print(parent[i] + " ");
        }
    }
}

