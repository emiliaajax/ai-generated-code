package ChatGPT.BreadthFirstSearch.T13;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        adjList.get(v).add(w);
        adjList.get(w).add(v);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        Arrays.fill(parentNodes, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parentNodes[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int neighbor : adjList.get(currentVertex)) {
                if (parentNodes[neighbor] == -1) {
                    parentNodes[neighbor] = currentVertex;
                    queue.add(neighbor);
                }
            }
        }
        return parentNodes;
    }
}
