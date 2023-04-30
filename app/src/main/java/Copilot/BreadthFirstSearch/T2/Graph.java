package Copilot.BreadthFirstSearch.T2;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
  private int vertices;
  private LinkedList<Integer> adjList[];

  public Graph(int vertices) {
      this.vertices = vertices;
      adjList = new LinkedList[vertices];
      for (int i = 0; i < vertices; i++) {
          adjList[i] = new LinkedList<>();
      }
  }

  public void addEdge(int src, int dest) {
      adjList[src].add(dest);
  }

  public int[] bfs(int sourceVertex) {
      int[] parent = new int[vertices];
      for (int i = 0; i < vertices; i++) {
          parent[i] = -1;
      }
      boolean[] visited = new boolean[vertices];
      Queue<Integer> queue = new LinkedList<>();
      visited[sourceVertex] = true;
      queue.add(sourceVertex);
      while (!queue.isEmpty()) {
          int currentVertex = queue.poll();
          for (int i = 0; i < adjList[currentVertex].size(); i++) {
              int adjVertex = adjList[currentVertex].get(i);
              if (!visited[adjVertex]) {
                  visited[adjVertex] = true;
                  parent[adjVertex] = currentVertex;
                  queue.add(adjVertex);
              }
          }
      }
      return parent;
  }
}
