package ChatGPT.BreadthFirstSearch.T49;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sourceVertex);
        parent[sourceVertex] = sourceVertex;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            for (int adjacent : adjList[currentVertex]) {
                if (parent[adjacent] == -1) {
                    queue.add(adjacent);
                    parent[adjacent] = currentVertex;
                }
            }
        }
        return parent;
    }
}
