package ChatGPT.BreadthFirstSearch.T19;

import java.util.*;

public class Graph {
    private int vertices;
    private List<Integer>[] adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new List[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        adjList[v1].add(v2);
        adjList[v2].add(v1);
    }

    public int[] bfs(int sourceVertex) {
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();
        parent[sourceVertex] = sourceVertex;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            int currVertex = queue.poll();
            for (int adjVertex : adjList[currVertex]) {
                if (parent[adjVertex] == -1) {
                    parent[adjVertex] = currVertex;
                    queue.add(adjVertex);
                }
            }
        }

        return parent;
    }
}
