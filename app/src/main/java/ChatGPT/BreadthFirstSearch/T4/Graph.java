package ChatGPT.BreadthFirstSearch.T4;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        Arrays.fill(parentNodes, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parentNodes[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (parentNodes[neighbor] == -1) {
                    parentNodes[neighbor] = currentVertex;
                    queue.offer(neighbor);
                }
            }
        }

        return parentNodes;
    }
}

