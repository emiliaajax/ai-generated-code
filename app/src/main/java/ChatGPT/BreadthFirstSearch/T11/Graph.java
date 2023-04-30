package ChatGPT.BreadthFirstSearch.T11;

import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int adjVertex : adjList[currentVertex]) {
                if (parent[adjVertex] == -1) {
                    queue.add(adjVertex);
                    parent[adjVertex] = currentVertex;
                }
            }
        }
        return parent;
    }
}
