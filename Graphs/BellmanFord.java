// --------------------------------BELLMAN FORD'S ALGORITHM---------------------------------------------
// BASICALLY USED TO FIND SHORTEST PATH OF ALL NODES FROM SOURCE NODE IN A GRAPH
// REQUIREMENTS:- A DISTANCE ARRAY
// CONCEPTS:- DISTANCE ARRAY -> This Array will store the distances of nodes from source node.
// WIKI:- https://en.wikipedia.org/wiki/Bellman%E2%80%93Ford_algorithm

import java.util.*;

public class BellmanFord {
    public static void main(String[] args) {
        int vertex = 3;
        int edge = 4;
        // example -----> [[0,1,5],[1,0,3],[1,2,-1],[2,0,1]]
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int[][] arr = { { 0, 1, 5 }, { 1, 0, 3 }, { 1, 2, -1 }, { 2, 0, 1 } };
        for (int i = 0; i < edge; i++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(arr[i][0]); // edge from this node
            tmp.add(arr[i][1]); // edge to this node
            tmp.add(arr[i][2]); // weight of this edge
            ls.add(tmp);
        }
        int source = 2; // Our Source Node
        int[] ans = bellman_ford(vertex, ls, source);
        // Printing our result(Optional)
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
        // Answer would come out as [1,6,0]
    }

    static int[] bellman_ford(int vertex, ArrayList<ArrayList<Integer>> ls, int S) {
        int[] dist = new int[vertex];
        for (int i = 0; i < vertex; i++) {
            if (S == i)
                dist[i] = 0;
            else
                dist[i] = Integer.MAX_VALUE; // we will put infinite initially in all distances
        }

        for (int i = 0; i < vertex - 1; i++) {
            for (int j = 0; j < ls.size(); j++) {
                int u = ls.get(j).get(0);
                int v = ls.get(j).get(1);
                int dis = ls.get(j).get(2);
                if (dist[u] != Integer.MAX_VALUE && dist[u] + dis < dist[v])
                    dist[v] = dist[u] + dis;
            }
        }

        for (int j = 0; j < ls.size(); j++) {
            int u = ls.get(j).get(0);
            int v = ls.get(j).get(1);
            int dis = ls.get(j).get(2);
            if (dist[u] != Integer.MAX_VALUE && dist[u] + dis < dist[v])
                return new int[] { -1 };
        }
        return dist;
    }
}