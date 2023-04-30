package Old.main.Copilot.BFSWithZero.T2;
// package Copilot.BFSWithZero.T2;

// import java.util.LinkedList;
// import java.util.Queue;

// public class BreadthFirstSearch {
//   private int vertices;
//   private LinkedList<Integer> adjListArray[];
//   private int[] parent;
//   private boolean[] visited;
//   private Queue<Integer> queue;

//   public BreadthFirstSearch(int vertices) {
//       this.vertices = vertices;
//       adjListArray = new LinkedList[vertices];
//       parent = new int[vertices];
//       visited = new boolean[vertices];
//       queue = new LinkedList<Integer>();

//       for (int i = 0; i < vertices; i++) {
//           adjListArray[i] = new LinkedList<>();
//       }
//   }

//   public void addEdge(int src, int dest) {
//       adjListArray[src].add(dest);
//       adjListArray[dest].add(src);
//   }

//   public int[] bfs(int sourceVertex) {
//       for (int i = 0; i < vertices; i++) {
//           parent[i] = 0;
//       }

//       visited[sourceVertex] = true;
//       queue.add(sourceVertex);

//       while (!queue.isEmpty()) {
//           int currentVertex = queue.poll();
//           System.out.print(currentVertex + " ");

//           for (int i = 0; i < adjListArray[currentVertex].size(); i++) {
//               int adjVertex = adjListArray[currentVertex].get(i);
//               if (!visited[adjVertex]) {
//                   visited[adjVertex] = true;
//                   queue.add(adjVertex);
//                   parent[adjVertex] = currentVertex;
//               }
//           }
//       }

//       return parent;
//   }
// }
