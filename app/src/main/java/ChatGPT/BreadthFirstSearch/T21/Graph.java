package ChatGPT.BreadthFirstSearch.T21;

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

    public void addEdge(int v1, int v2) {
        adjacencyList[v1].add(v2);
        adjacencyList[v2].add(v1);
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
