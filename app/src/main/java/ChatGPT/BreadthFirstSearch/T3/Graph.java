package ChatGPT.BreadthFirstSearch.T3;

import java.util.*;

public class Graph {
    private int V; // number of vertices
    private LinkedList<Integer>[] adjList; // adjacency list

    public Graph(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        parent[sourceVertex] = -1; // source vertex has no parent
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList[u]) {
                if (parent[v] == -1) {
                    parent[v] = u;
                    queue.offer(v);
                }
            }
        }

        return parent;
    }
}
