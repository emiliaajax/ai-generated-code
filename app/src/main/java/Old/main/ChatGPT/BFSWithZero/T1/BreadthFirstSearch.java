package Old.main.ChatGPT.BFSWithZero.T1;
// package ChatGPT.BFSWithZero.T1;

// import java.util.LinkedList;
// import java.util.Queue;

// public class BreadthFirstSearch {

//     private int vertices;
//     private int[][] adjacencyMatrix;

//     public BreadthFirstSearch(int vertices) {
//         this.vertices = vertices;
//         this.adjacencyMatrix = new int[vertices][vertices];
//     }

//     public void addEdge(int vertex1, int vertex2) {
//         adjacencyMatrix[vertex1][vertex2] = 1;
//         adjacencyMatrix[vertex2][vertex1] = 1;
//     }

//     public int[] bfs(int sourceVertex) {
//         int[] parentNodes = new int[vertices];
//         boolean[] visited = new boolean[vertices];
//         Queue<Integer> queue = new LinkedList<>();

//         visited[sourceVertex] = true;
//         queue.offer(sourceVertex);

//         while (!queue.isEmpty()) {
//             int currentVertex = queue.poll();

//             for (int i = 0; i < vertices; i++) {
//                 if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
//                     visited[i] = true;
//                     parentNodes[i] = currentVertex;
//                     queue.offer(i);
//                 }
//             }
//         }

//         return parentNodes;
//     }
// }


