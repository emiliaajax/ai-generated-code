package BookExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Source: https://github.com/TrainingByPackt/Data-Structures-and-Algorithms-in-Java/blob/master/src/main/java/com/packt/datastructuresandalg/lesson6/bfs/Graph.java
public class Graph {
  ArrayList<Integer> adj[];

  public Graph(int nodes) {
    this.adj = new ArrayList[nodes];
    for (int i = 0; i < nodes; i++) {
      this.adj[i] = new ArrayList<>();
    }
  }

  public void addEdge(int u, int v) {
    this.adj[u].add(v);
  }

  public int[] bfs(int start) {
    int[] parent = new int[this.adj.length];
    boolean[] visited = new boolean[this.adj.length];

    for (int i = 0; i < this.adj.length; i++) {
      parent[i] = -1;
      visited[i] = false;
    }

    visited[start] = true;
    Queue<Integer> q = new LinkedList<>();
    q.add(start);
    while (!q.isEmpty()) {
      int current = q.remove();
      for (int i = 0; i < this.adj[current].size(); i++) {
        int next = this.adj[current].get(i);
        if (!visited[next]) {
          visited[next] = true;
          parent[next] = current;
          q.add(next);
        }
      }
    }
    return parent;
  }
}
