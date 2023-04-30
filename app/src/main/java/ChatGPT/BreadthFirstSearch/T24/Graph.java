package ChatGPT.BreadthFirstSearch.T24;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        Arrays.fill(parentNodes, -1);
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parentNodes[neighbor] = currentVertex;
                    queue.add(neighbor);
                }
            }
        }
        return parentNodes;
    }
}
