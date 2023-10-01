// --------------------------------KAHN'S ALGORITHM---------------------------------------------
// BASICALLY BREADTH FIRST SEARCH APPROACH TO FIND TOPOLOGICAL SORT FOR DIRECTED ACYCLIC GRAPH
// REQUIREMENTS:- QUEUE AND A INDEGREE ARRAY
// CONCEPTS:- INDERGREE ARRAY -> Array containing total number of edges directed towards a node in a graph.

import java.util.*;

public class kahns_Algo {
    public static void main(String[] args) {
        // main algo is in kahn function
    }

    public int[] kahn(int V, ArrayList<ArrayList<Integer>> adj) { // V =no. of vertices ,adj =Adjacency matrix
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
