package ChatGPT.BreadthFirstSearch.T5;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        this.adjacencyList.get(source).add(destination);
        this.adjacencyList.get(destination).add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        Arrays.fill(parentNodes, -1);

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.offer(sourceVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            List<Integer> neighbors = this.adjacencyList.get(currentVertex);

            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parentNodes[neighbor] = currentVertex;
                    queue.offer(neighbor);
                }
            }
        }

        return parentNodes;
    }
}

