package ChatGPT.BreadthFirstSearch.T7;

import java.util.*;

public class Graph {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjList = new ArrayList<ArrayList<Integer>>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[vertices];
        Arrays.fill(parents, -1);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(sourceVertex);
        parents[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList.get(u)) {
                if (parents[v] == -1) {
                    parents[v] = u;
                    queue.offer(v);
                }
            }
        }

        return parents;
    }
}
