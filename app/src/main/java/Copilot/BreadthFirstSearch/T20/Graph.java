package Copilot.BreadthFirstSearch.T20;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;
    private boolean[] visited;
    private int[] parent;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<Integer>();
            visited[i] = false;
            parent[i] = -1;
        }
    }

    public void addEdge(int i, int j) {
        adjList[i].add(j);
    }

    public int[] bfs(int sourceVertex) {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);
        visited[sourceVertex] = true;
        while (queue.size() != 0) {
            int u = queue.poll();
            for (int i = 0; i < adjList[u].size(); i++) {
                int v = adjList[u].get(i);
                if (!visited[v]) {
                    visited[v] = true;
                    parent[v] = u;
                    queue.add(v);
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
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        int[] parent = graph.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("parent[" + i + "] = " + parent[i]);
        }
    }
}
