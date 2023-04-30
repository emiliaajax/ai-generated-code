package Old.main.ChatGPT.BFSWithZero.T6;
// package ChatGPT.BFSWithZero.T6;

// import java.util.*;

// public class BreadthFirstSearch {
//     private int numVertices;
//     private List<Integer>[] adjList;

//     public BreadthFirstSearch(int numVertices) {
//         this.numVertices = numVertices;
//         adjList = new List[numVertices];
//         for (int i = 0; i < numVertices; i++) {
//             adjList[i] = new ArrayList<Integer>();
//         }
//     }

//     public void addEdge(int u, int v) {
//         adjList[u].add(v);
//         adjList[v].add(u);
//     }

//     public int[] bfs(int sourceVertex) {
//         int[] parents = new int[numVertices];
//         Arrays.fill(parents, 0);
//         Queue<Integer> queue = new LinkedList<>();
//         boolean[] visited = new boolean[numVertices];

//         visited[sourceVertex] = true;
//         queue.offer(sourceVertex);

//         while (!queue.isEmpty()) {
//             int u = queue.poll();
//             for (int v : adjList[u]) {
//                 if (!visited[v]) {
//                     visited[v] = true;
//                     parents[v] = u;
//                     queue.offer(v);
//                 }
//             }
//         }

//         return parents;
//     }
// }

