package ChatGPT.BreadthFirstSearch.T47;

import java.util.*;

public class Graph {
    private int V;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        parent[sourceVertex] = sourceVertex;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : adjList[v]) {
                if (parent[w] == -1) {
                    parent[w] = v;
                    queue.add(w);
                }
            }
        }

        return parent;
    }
}
