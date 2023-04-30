package Copilot.BreadthFirstSearch.T47;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjLists[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    public int[] bfs(int sourceVertex) {
        int[] parentNodes = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parentNodes[i] = -1;
        }

        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (queue.size() != 0) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < adjLists[vertex].size(); i++) {
                int adjVertex = adjLists[vertex].get(i);
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                    parentNodes[adjVertex] = vertex;
                }
            }
        }

        return parentNodes;
    }

    public static void main(String args[]) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        int[] parentNodes = graph.bfs(0);
        System.out.println();
        for (int i = 0; i < parentNodes.length; i++) {
            System.out.println(i + " parent: " + parentNodes[i]);
        }
    }
}
