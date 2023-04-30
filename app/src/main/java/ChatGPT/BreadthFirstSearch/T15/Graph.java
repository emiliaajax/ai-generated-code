package ChatGPT.BreadthFirstSearch.T15;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList[u].add(v);
        adjacencyList[v].add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parentNodes[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parentNodes[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int adjacentVertex : adjacencyList[currentVertex]) {
                if (parentNodes[adjacentVertex] == -1) {
                    parentNodes[adjacentVertex] = currentVertex;
                    queue.add(adjacentVertex);
                }
            }
        }
        return parentNodes;
    }
}
