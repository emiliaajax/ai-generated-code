package ChatGPT.BreadthFirstSearch.T36;

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

    public void addEdge(int fromVertex, int toVertex) {
        adjacencyList.get(fromVertex).add(toVertex);
        adjacencyList.get(toVertex).add(fromVertex);
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[vertices];
        Arrays.fill(parents, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parents[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (parents[neighbor] == -1) {
                    queue.add(neighbor);
                    parents[neighbor] = currentVertex;
                }
            }
        }

        return parents;
    }
}
