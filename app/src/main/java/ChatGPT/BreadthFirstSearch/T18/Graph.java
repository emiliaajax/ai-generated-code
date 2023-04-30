package ChatGPT.BreadthFirstSearch.T18;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacencyList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        this.adjacencyList.get(u).add(v);
        this.adjacencyList.get(v).add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[this.vertices];
        Arrays.fill(parents, -1);
        parents[sourceVertex] = -1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();

            for (int neighbor : this.adjacencyList.get(currentVertex)) {
                if (parents[neighbor] == -1) {
                    parents[neighbor] = currentVertex;
                    queue.offer(neighbor);
                }
            }
        }

        return parents;
    }
}
