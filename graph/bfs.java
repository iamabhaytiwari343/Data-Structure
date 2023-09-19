package graph;

import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        Graph graph = new Graph(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.BFS(0);
    }
}

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list representation of the graph

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Perform BFS traversal starting from a given source vertex
    public void BFS(int s) {
        boolean[] visited = new boolean[V]; // Keep track of visited vertices

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If an adjacent vertex hasn't been visited, mark it as visited and enqueue it
            for (Integer neighbor : adj[s]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
