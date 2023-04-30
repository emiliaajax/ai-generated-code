package ChatGPT.BreadthFirstSearch.T20;

import java.util.*;

public class Graph {
    private int V;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertices) {
        V = vertices;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    public int[] bfs(int sourceVertex) {
        int[] parents = new int[V];
        Arrays.fill(parents, -1);

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(sourceVertex);
        parents[sourceVertex] = sourceVertex;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            Iterator<Integer> iterator = adjList[curr].listIterator();

            while (iterator.hasNext()) {
                int neighbor = iterator.next();
                if (parents[neighbor] == -1) {
                    parents[neighbor] = curr;
                    queue.add(neighbor);
                }
            }
        }

        return parents;
    }
}
