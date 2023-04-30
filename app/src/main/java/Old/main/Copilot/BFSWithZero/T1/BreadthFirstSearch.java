package Old.main.Copilot.BFSWithZero.T1;
// package Copilot.BFSWithZero.T1;

// import java.util.Iterator;
// import java.util.LinkedList;

// public class BreadthFirstSearch {
//     private int vertices;
//     private LinkedList<Integer> adj[];
//     public BreadthFirstSearch(int vertices) {
//         this.vertices = vertices;
//         adj = new LinkedList[vertices];
//         for (int i = 0; i < vertices; i++) {
//             adj[i] = new LinkedList();
//         }
//     }
//     public void addEdge(int v, int w) {
//         adj[v].add(w);
//     }
//     public int[] bfs(int sourceVertex) {
//         int[] parent = new int[vertices];
//         boolean[] visited = new boolean[vertices];
//         LinkedList<Integer> queue = new LinkedList<Integer>();
//         visited[sourceVertex] = true;
//         queue.add(sourceVertex);
//         while (queue.size() != 0) {
//             sourceVertex = queue.poll();
//             Iterator<Integer> i = adj[sourceVertex].listIterator();
//             while (i.hasNext()) {
//                 int n = i.next();
//                 if (!visited[n]) {
//                     visited[n] = true;
//                     parent[n] = sourceVertex;
//                     queue.add(n);
//                 }
//             }
//         }
//         return parent;
//     }
// }
