package ChatGPT.BreadthFirstSearch.T34;

import java.util.*;

public class Graph {
    private int numVertices;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        numVertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[numVertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adjList.get(current)) {
                if (parent[neighbor] == -1) {
                    parent[neighbor] = current;
                    queue.add(neighbor);
                }
            }
        }
        return parent;
    }
}
