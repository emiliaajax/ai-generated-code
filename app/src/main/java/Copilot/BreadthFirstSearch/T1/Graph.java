package Copilot.BreadthFirstSearch.T1;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
  private int vertices;
  private LinkedList<Integer> adj[];

  public Graph(int vertices) {
      this.vertices = vertices;
      adj = new LinkedList[vertices];
      for (int i = 0; i < vertices; i++) {
          adj[i] = new LinkedList();
      }
  }

  public void addEdge(int source, int destination) {
      adj[source].add(destination);
      adj[destination].add(source);
  }

  public int[] bfs(int sourceVertex) {
      int[] parent = new int[vertices];
      for (int i = 0; i < vertices; i++) {
          parent[i] = -1;
      }
      boolean[] visited = new boolean[vertices];
      LinkedList<Integer> queue = new LinkedList();
      visited[sourceVertex] = true;
      queue.add(sourceVertex);
      while (queue.size() != 0) {
          int vertex = queue.poll();
          Iterator<Integer> iterator = adj[vertex].listIterator();
          while (iterator.hasNext()) {
              int adjacentVertex = iterator.next();
              if (!visited[adjacentVertex]) {
                  visited[adjacentVertex] = true;
                  queue.add(adjacentVertex);
                  parent[adjacentVertex] = vertex;
              }
          }
      }
      return parent;
  }
}
