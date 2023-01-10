package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_graph {
    public static void main(String[] args) {
        BFS_graph g = new BFS_graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        // 4
        System.out.println(g);
        g.bfs(2);
    }
    public BFS_graph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    private int E;
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for(int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for(int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    private int V;
    private LinkedList<Integer>[ ] adj;
    public void bfs(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u+" ");

            for (int v : adj[u]) {
                if (!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }

    }


}
