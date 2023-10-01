// --------------------------------KAHN'S ALGORITHM---------------------------------------------
// BASICALLY BREADTH FIRST SEARCH APPROACH TO FIND TOPOLOGICAL SORT FOR DIRECTED ACYCLIC GRAPH
// REQUIREMENTS:- QUEUE AND A INDEGREE ARRAY
// CONCEPTS:- INDERGREE ARRAY -> Array containing total number of edges directed towards a node in a graph.
// WIKI:- https://en.wikipedia.org/wiki/Topological_sorting

import java.util.*;

public class kahns_Algo {
    public static void main(String[] args) {
        int V = 6;
        // example -----> [[],[3],[3],[],[0,1],[2,0]]
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[][] mat = { {}, { 3 }, { 3 }, {}, { 0, 1 }, { 2, 0 } }; // There is an directed edge from index to all given
                                                                    // elements in that index
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < mat[i].length; j++)
                temp.add(mat[i][j]);
            adj.add(temp);
        }
        int[] ans = kahn(V, adj);
        // Printing our result(Optional)
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
        // Answer is 4 5 1 2 0 3 here
    }

    static int[] kahn(int V, ArrayList<ArrayList<Integer>> adj) { // V =no. of vertices ,adj =Adjacency matrix
                                                                  // containing edges between vertices
        Queue<Integer> qu = new LinkedList<>();
        int[] indeg = new int[V];
        int[] ans = new int[V]; // Final Array containing our topological sort

        for (int i = 0; i < V; i++) {
            for (int j : adj.get(i))
                indeg[j]++;
        }

        for (int i = 0; i < V; i++) {
            if (indeg[i] == 0)
                qu.offer(i);
        }

        int cnt = 0;
        while (!qu.isEmpty()) {
            int curr = qu.poll();
            ans[cnt++] = curr;

            for (int i : adj.get(curr)) {
                --indeg[i];
                if (indeg[i] == 0)
                    qu.offer(i);
            }
        }

        return ans;
    }
}
