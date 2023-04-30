package ChatGPT.BreadthFirstSearch.T12;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u); // comment this line if the graph is directed
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[vertices];
        Arrays.fill(parents, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(sourceVertex);
        parents[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjacencyList.get(u)) {
                if (parents[v] == -1) {
                    parents[v] = u;
                    queue.offer(v);
                }
            }
        }

        return parents;
    }
}
