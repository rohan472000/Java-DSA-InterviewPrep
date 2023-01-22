package Graphs;

import java.util.ArrayList;

public class print_full_path {
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

            graph[0].add(new edge(0, 1));
            graph[0].add(new edge(0, 2));

            graph[1].add(new edge(1, 0));
            graph[1].add(new edge(1, 3));

            graph[2].add(new edge(2, 0));
            graph[2].add(new edge(2, 4));

            graph[3].add(new edge(3, 1));
            graph[3].add(new edge(3, 4));
            graph[3].add(new edge(3, 5));

            graph[4].add(new edge(4, 2));
            graph[4].add(new edge(4, 3));
            graph[4].add(new edge(4, 5));

            graph[5].add(new edge(5, 3));
            graph[5].add(new edge(5, 4));
            graph[5].add(new edge(5, 6));

            graph[5].add(new edge(6, 5));

        }
        //O(V^V) where V = vertices
        public static void printAllPath(ArrayList<edge> graph[],boolean vis[], int curr,String path, int tar){
            if (curr == tar){
                System.out.println(path);
                return;
            }
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                if (!vis[e.dest]){
                    vis[curr] = true;
                    printAllPath(graph,vis,e.dest,path+e.dest,tar);
                    vis[curr] = false;
                }
            }
        }
        public static void main(String[] args) {
          int V = 7;
          ArrayList<edge> graph[] = new ArrayList[V];
          createGraph(graph);

          int src=0, tar=5;
          printAllPath(graph,new boolean[V],src,"0",tar);
        }
    }
