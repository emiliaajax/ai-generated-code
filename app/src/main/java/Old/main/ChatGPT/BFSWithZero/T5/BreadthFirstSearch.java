package Old.main.ChatGPT.BFSWithZero.T5;
// package ChatGPT.BFSWithZero.T5;

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
//         Arrays.fill(parent, -1);
//         Queue<Integer> queue = new LinkedList<>();
//         boolean[] visited = new boolean[numVertices];

//         visited[sourceVertex] = true;
//         queue.add(sourceVertex);

//         while (!queue.isEmpty()) {
//             int currentVertex = queue.poll();
//             for (int neighbor : adjacencyList.get(currentVertex)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     parent[neighbor] = currentVertex;
//                     queue.add(neighbor);
//                 }
//             }
//         }

//         return parent;
//     }

//     public void addEdge(int source, int destination) {
//         adjacencyList.get(source).add(destination);
//         adjacencyList.get(destination).add(source);
//     }
// }

