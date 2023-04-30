package Old.main.ChatGPT.BFSWithZero.T4;
// package ChatGPT.BFSWithZero.T4;

// import java.util.*;

// public class BreadthFirstSearch {
//     private int numVertices;
//     private List<List<Integer>> adjList;

//     public BreadthFirstSearch(int numVertices) {
//         this.numVertices = numVertices;
//         adjList = new ArrayList<>(numVertices);
//         for (int i = 0; i < numVertices; i++) {
//             adjList.add(new ArrayList<Integer>());
//         }
//     }

//     public void addEdge(int src, int dest) {
//         adjList.get(src).add(dest);
//         adjList.get(dest).add(src);
//     }

//     public int[] bfs(int sourceVertex) {
//         Queue<Integer> queue = new LinkedList<>();
//         boolean[] visited = new boolean[numVertices];
//         int[] parentNodes = new int[numVertices];
//         Arrays.fill(parentNodes, 0);

//         visited[sourceVertex] = true;
//         queue.offer(sourceVertex);

//         while (!queue.isEmpty()) {
//             int currVertex = queue.poll();
//             for (int neighbor : adjList.get(currVertex)) {
//                 if (!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     parentNodes[neighbor] = currVertex;
//                     queue.offer(neighbor);
//                 }
//             }
//         }

//         return parentNodes;
//     }
// }


