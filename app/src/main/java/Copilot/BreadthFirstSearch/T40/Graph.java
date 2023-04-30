package Copilot.BreadthFirstSearch.T40;

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
        adjListArray[dest].add(src);
    }

    public int[] bfs(int sourceVertex) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[sourceVertex] = true;
        queue.add(sourceVertex);
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.println("Visiting vertex " + currentVertex);
            Iterator<Integer> it = adjListArray[currentVertex].listIterator();
            while (it.hasNext()) {
                int adjVertex = it.next();
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                    parent[adjVertex] = currentVertex;
                }
            }
        }
        return parent;
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 4);
        g.addEdge(1, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        int[] parent = g.bfs(0);
        for (int i = 0; i < parent.length; i++) {
            System.out.println("Parent of vertex " + i + " is " + parent[i]);
        }
    }
}
