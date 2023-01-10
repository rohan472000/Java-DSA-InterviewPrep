package Graphs;

import java.util.LinkedList;
import java.util.Stack;

public class DFS_graph {
    public static void main(String[] args) {

    }
    public DFS_graph(int nodes) {
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

    private int vertices;
public  void  dfs(int s){
        boolean[] visited = new boolean[vertices];
    Stack<Integer> stack = new Stack<>();
    stack.push(s);
    while (!stack.isEmpty()){
        int u = stack.pop();
        if (!visited[u]){
            visited[u]  = true;
            System.out.println(u);
            for (int v : adj[u]) {
                 if (!visited[v]){
                     stack.push(v);
                 }
            }
        }
    }
}
}

