package Graphs;

import java.util.LinkedList;

public class grabh_by_linkedList {
    public static void main(String[] args) {
          grabh_by_linkedList g = new grabh_by_linkedList(4);
          g.addEdge(0,1);
    }
   private LinkedList<Integer>[] adj;
    private int V;//no. of vertices
    private int E;//no. of edges

    public grabh_by_linkedList(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u , int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

}
