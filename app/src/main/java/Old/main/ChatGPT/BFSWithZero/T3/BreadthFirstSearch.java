package Old.main.ChatGPT.BFSWithZero.T3;
// package ChatGPT.BFSWithZero.T3;

// import java.util.*;

// public class BreadthFirstSearch {
//     private int numVertices;
//     private List<List<Integer>> adjacencyList;

//     public BreadthFirstSearch(int numVertices) {
//         this.numVertices = numVertices;
//         adjacencyList = new ArrayList<>(numVertices);
//         for (int i = 0; i < numVertices; i++) {
//             adjacencyList.add(new ArrayList<>());
//         }
//     }

//     public int[] bfs(int sourceVertex) {
//         int[] parent = new int[numVertices];
//         Arrays.fill(parent, 0); // initialize all elements to 0
//         boolean[] visited = new boolean[numVertices];
//         Queue<Integer> queue = new LinkedList<>();
//         visited[sourceVertex] = true;
//         queue.offer(sourceVertex);
//         while (!queue.isEmpty()) {
//             int currentVertex = queue.poll();
//             for (int neighbor : adjacencyList.get(currentVertex)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     parent[neighbor] = currentVertex;
//                     queue.offer(neighbor);
//                 }
//             }
//         }
//         return parent;
//     }

//     public void addEdge(int u, int v) {
//         adjacencyList.get(u).add(v);
//         adjacencyList.get(v).add(u);
//     }
// }

