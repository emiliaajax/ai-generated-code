package Copilot.BreadthFirstSearch.T31;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjListArray[];
    private int parent[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjListArray = new LinkedList[vertices];
        parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
            parent[i] = -1;
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
    }

    public int[] bfs(int sourceVertex) {
        boolean visited[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (queue.size() != 0) {
            sourceVertex = queue.poll();
            System.out.print(sourceVertex + " ");
            Iterator<Integer> itr = adjListArray[sourceVertex].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    visited[n] = true;
                    parent[n] = sourceVertex;
                    queue.add(n);
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        Graph g = new Graph(8);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(3, 7);
        g.addEdge(4, 7);
        g.addEdge(5, 7);
        g.addEdge(6, 7);
        int parent[] = g.bfs(0);
        System.out.println();
        for (int i = 0; i < parent.length; i++) {
            System.out.print(parent[i] + " ");
        }
    }
}
