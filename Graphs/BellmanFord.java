// --------------------------------BELLMAN FORD'S ALGORITHM---------------------------------------------
// BASICALLY USED TO FIND SHORTEST PATH OF ALL NODES FROM SOURCE NODE IN A GRAPH
// REQUIREMENTS:- A DISTANCE ARRAY
// CONCEPTS:- DISTANCE ARRAY -> This Array will store the distances of nodes from source node.
// WIKI:- https://en.wikipedia.org/wiki/Bellman%E2%80%93Ford_algorithm

import java.util.*;

public class BellmanFord {
    public static void main(String[] args) {
        int V = 3;
        int E = 4;
        // example -----> [[0,1,5],[1,0,3],[1,2,-1],[2,0,1]]
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        int[][] arr = { { 0, 1, 5 }, { 1, 0, 3 }, { 1, 2, -1 }, { 2, 0, 1 } };
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(arr[i][0]); // edge from this node
            tmp.add(arr[i][1]); // edge to this node
            tmp.add(arr[i][2]); // weight of this edge
            edges.add(tmp);
        }
        int S = 2; // Our Source Node
        int[] ans = bellman_ford(V, edges, S);
        // Printing our result(Optional)
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
        // Answer would come out as [1,6,0]
    }

    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if (S == i)
                dist[i] = 0;
            else
                dist[i] = Integer.MAX_VALUE; // we will put infinite initially in all distances
        }

        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < edges.size(); j++) {
                int u = edges.get(j).get(0);
                int v = edges.get(j).get(1);
                int dis = edges.get(j).get(2);
                if (dist[u] != Integer.MAX_VALUE && dist[u] + dis < dist[v])
                    dist[v] = dist[u] + dis;
            }
        }

        for (int j = 0; j < edges.size(); j++) {
            int u = edges.get(j).get(0);
            int v = edges.get(j).get(1);
            int dis = edges.get(j).get(2);
            if (dist[u] != Integer.MAX_VALUE && dist[u] + dis < dist[v])
                return new int[] { -1 };
        }
        return dist;
    }
}