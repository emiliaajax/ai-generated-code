package ChatGPT.BreadthFirstSearch.T32;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int dest) {
        adjList[source].add(dest);
        adjList[dest].add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adjList[current]) {
                if (parent[neighbor] == -1) {
                    queue.add(neighbor);
                    parent[neighbor] = current;
                }
            }
        }

        return parent;
    }
}
