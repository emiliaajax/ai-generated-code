package ChatGPT.BreadthFirstSearch.T28;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // comment out if directed graph
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[vertices];
        Arrays.fill(parents, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parents[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int currVertex = queue.poll();

            for (int neighbor : adjList.get(currVertex)) {
                if (parents[neighbor] == -1) {
                    parents[neighbor] = currVertex;
                    queue.offer(neighbor);
                }
            }
        }

        return parents;
    }
}
