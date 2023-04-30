package Old.main.ChatGPT.BFSWithZero.T2;
// package ChatGPT.BFSWithZero.T2;

// import java.util.*;

// public class BreadthFirstSearch {
//     private int vertices;
//     private List<Integer>[] adjList;

//     public BreadthFirstSearch(int vertices) {
//         this.vertices = vertices;
//         adjList = new ArrayList[vertices];
//         for (int i = 0; i < vertices; i++) {
//             adjList[i] = new ArrayList<Integer>();
//         }
//     }

//     public void addEdge(int u, int v) {
//         adjList[u].add(v);
//         adjList[v].add(u);
//     }

//     public int[] bfs(int sourceVertex) {
//         boolean[] visited = new boolean[vertices];
//         int[] parents = new int[vertices];
//         Queue<Integer> queue = new LinkedList<Integer>();
//         visited[sourceVertex] = true;
//         queue.offer(sourceVertex);
//         while (!queue.isEmpty()) {
//             int currentVertex = queue.poll();
//             for (int neighbor : adjList[currentVertex]) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     parents[neighbor] = currentVertex;
//                     queue.offer(neighbor);
//                 }
//             }
//         }
//         return parents;
//     }
// }


