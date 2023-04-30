package ChatGPT.BreadthFirstSearch.T50;

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

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parentNodes[i] = -1;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parentNodes[sourceVertex] = -1;
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
