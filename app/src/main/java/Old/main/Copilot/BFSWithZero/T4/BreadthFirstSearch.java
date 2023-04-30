package Old.main.Copilot.BFSWithZero.T4;
// package Copilot.BFSWithZero.T4;

// import java.util.Iterator;
// import java.util.LinkedList;

// // Implement a non-static class named BreadthFirstSearch. The BreadthFirstSearch class should be initialized with an int of the number of vertices in its constructor.
// // Implement the public bfs(int sourceVertex) method. The method should return an integer array of parent nodes for each vertex in the graph. The array of parent nodes is initialized to all 0s in the bfs(int sourceVertex) method. 
// // Implement the public addEdge(int, int). The method should add an edge between two vertices.
// public class BreadthFirstSearch {
//   private int vertices;
//   private LinkedList<Integer> adjacencyList[];

//   public BreadthFirstSearch(int vertices) {
//     this.vertices = vertices;
//     adjacencyList = new LinkedList[vertices];
//     for (int i = 0; i < vertices; i++) {
//       adjacencyList[i] = new LinkedList();
//     }
//   }

//   public void addEdge(int sourceVertex, int destinationVertex) {
//     adjacencyList[sourceVertex].add(destinationVertex);
//   }

//   public int[] bfs(int sourceVertex) {
//     int[] parent = new int[vertices];
//     for (int i = 0; i < vertices; i++) {
//       parent[i] = 0;
//     }
//     boolean[] visited = new boolean[vertices];
//     LinkedList<Integer> queue = new LinkedList();
//     visited[sourceVertex] = true;
//     queue.add(sourceVertex);
//     while (queue.size() != 0) {
//       int currentVertex = queue.poll();
//       Iterator<Integer> iterator = adjacencyList[currentVertex].listIterator();
//       while (iterator.hasNext()) {
//         int nextVertex = iterator.next();
//         if (!visited[nextVertex]) {
//           visited[nextVertex] = true;
//           parent[nextVertex] = currentVertex;
//           queue.add(nextVertex);
//         }
//       }
//     }
//     return parent;
//   }
// }