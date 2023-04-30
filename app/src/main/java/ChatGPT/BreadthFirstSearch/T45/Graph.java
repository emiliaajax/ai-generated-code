package ChatGPT.BreadthFirstSearch.T45;

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
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        Arrays.fill(parentNodes, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parentNodes[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            List<Integer> neighbors = adjacencyList.get(currentVertex);
            for (int neighbor : neighbors) {
                if (parentNodes[neighbor] == -1) {
                    queue.add(neighbor);
                    parentNodes[neighbor] = currentVertex;
                }
            }
        }

        return parentNodes;
    }
}
