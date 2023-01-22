package Graphs;

import java.util.ArrayList;

public class cycle_detection {
    public static class edge {
        int src;
        int dest;

        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,0));
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,0));
    }
    public static boolean cyclic(ArrayList<edge> graph[],boolean vis[], int curr, boolean rec[]){
       vis[curr] = true;
       rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if(rec[e.dest]){ // cyclic
                return true;
            } else if (!vis[e.dest]) {
                if(cyclic(graph,vis,e.dest,rec))
                    return true;
            }
        }
        rec[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(cyclic(graph, new boolean[V],0,new boolean[V]));
    }
}
