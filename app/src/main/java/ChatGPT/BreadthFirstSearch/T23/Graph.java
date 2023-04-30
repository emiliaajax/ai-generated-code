package ChatGPT.BreadthFirstSearch.T23;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        this.adjacencyList[vertex1].add(vertex2);
        this.adjacencyList[vertex2].add(vertex1);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        Arrays.fill(parentNodes, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parentNodes[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjacencyList[currentVertex]) {
                if (parentNodes[neighbor] == -1) {
                    parentNodes[neighbor] = currentVertex;
                    queue.add(neighbor);
                }
            }
        }
        return parentNodes;
    }
}
