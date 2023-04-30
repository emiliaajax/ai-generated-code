package ChatGPT.BreadthFirstSearch.T6;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int adjacentVertex : adjacencyList[currentVertex]) {
                if (!visited[adjacentVertex]) {
                    visited[adjacentVertex] = true;
                    parent[adjacentVertex] = currentVertex;
                    queue.add(adjacentVertex);
                }
            }
        }

        return parent;
    }
}
