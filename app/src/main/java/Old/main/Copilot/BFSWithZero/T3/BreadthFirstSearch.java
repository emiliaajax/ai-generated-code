package Old.main.Copilot.BFSWithZero.T3;
// package Copilot.BFSWithZero.T3;

// import java.util.LinkedList;
// import java.util.Queue;

// public class BreadthFirstSearch {
//   private int vertices;
//   private LinkedList<Integer> adjList[];
//   private int[] parent;
//   private boolean[] visited;
//   private Queue<Integer> queue;

//   public BreadthFirstSearch(int vertices) {
//       this.vertices = vertices;
//       adjList = new LinkedList[vertices];
//       parent = new int[vertices];
//       visited = new boolean[vertices];
//       queue = new LinkedList<Integer>();
//       for (int i = 0; i < vertices; i++) {
//           adjList[i] = new LinkedList<Integer>();
//       }
//   }

//   public void addEdge(int source, int destination) {
//       adjList[source].add(destination);
//   }

//   public int[] bfs(int sourceVertex) {
//       visited[sourceVertex] = true;
//       queue.add(sourceVertex);
//       while (!queue.isEmpty()) {
//           int currentVertex = queue.poll();
//           for (int i = 0; i < adjList[currentVertex].size(); i++) {
//               int adjVertex = adjList[currentVertex].get(i);
//               if (!visited[adjVertex]) {
//                   visited[adjVertex] = true;
//                   parent[adjVertex] = currentVertex;
//                   queue.add(adjVertex);
//               }
//           }
//       }
//       return parent;
//   }
// }
