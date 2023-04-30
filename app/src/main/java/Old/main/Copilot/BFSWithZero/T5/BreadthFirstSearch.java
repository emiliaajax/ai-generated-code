package Old.main.Copilot.BFSWithZero.T5;
// package Copilot.BFSWithZero.T5;

// import java.util.LinkedList;

// // Implement a non-static class named BreadthFirstSearch. The BreadthFirstSearch class should be initialized with an int of the number of vertices in its constructor.
// // Implement the public bfs(int sourceVertex) method. The method should return an integer array of parent nodes for each vertex in the graph. The array of parent nodes is initialized to all 0s in the bfs(int sourceVertex) method. 
// // Implement the public addEdge(int, int). The method should add an edge between two vertices.
// public class BreadthFirstSearch {
//   private int vertices;
//   private LinkedList<Integer> adj[];

//   public BreadthFirstSearch(int vertices) {
//     this.vertices = vertices;
//     adj = new LinkedList[vertices];
//     for (int i = 0; i < vertices; i++) {
//       adj[i] = new LinkedList();
//     }
//   }

//   public void addEdge(int sourceVertex, int destinationVertex) {
//     adj[sourceVertex].add(destinationVertex);
//   }

//   public int[] bfs(int sourceVertex) {
//     boolean visited[] = new boolean[vertices];
//     int[] parent = new int[vertices];
//     LinkedList<Integer> queue = new LinkedList();
//     visited[sourceVertex] = true;
//     queue.add(sourceVertex);
//     while (queue.size() != 0) {
//       int currentVertex = queue.poll();
//       for (int i = 0; i < adj[currentVertex].size(); i++) {
//         int nextVertex = adj[currentVertex].get(i);
//         if (!visited[nextVertex]) {
//           visited[nextVertex] = true;
//           queue.add(nextVertex);
//           parent[nextVertex] = currentVertex;
//         }
//       }
//     }
//     return parent;
//   }
// }