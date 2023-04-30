package ChatGPT.BreadthFirstSearch.T35;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new List[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.offer(sourceVertex);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    parent[v] = u;
                    queue.offer(v);
                }
            }
        }
        return parent;
    }
}
