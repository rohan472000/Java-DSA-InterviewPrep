// --------------------------------PRIM'S ALGORITHM---------------------------------------------
// BASICALLY USED TO FIND OUT THE MST SUM OR THE MST TREE
// REQUIREMENTS:- PRIORITY QUEUE AND A VISITED ARRAY
// CONCEPTS:- VISITED ARRAY -> This Array will tell whether a node is visited or not.
// WIKI:- https://en.wikipedia.org/wiki/Prim%27s_algorithm

import java.util.*;

class Pair { // A class pair is required here which contains node and it's distance from
             // starting node
    int node;
    int distance;

    Pair(int nod, int dist) {
        node = nod;
        distance = dist;
    }
}

public class Prims_Algo {
    public static void main(String[] args) {
        // main algo is in prims function
    }

    public int prims(int V, int E, int edges[][]) { // V =no. of vertices ,E =no. of edges ,edges =edges of each node
        ArrayList<ArrayList<Pair>> arr = new ArrayList<>();
        for (int i = 0; i < V; i++)
            arr.add(new ArrayList<>());
        for (int i = 0; i < E; i++) {
            int parent = edges[i][0];
            int current = edges[i][1];
            int wt = edges[i][2];

            arr.get(parent).add(new Pair(current, wt));
            arr.get(current).add(new Pair(parent, wt));
        }

        PriorityQueue<Pair> qu = new PriorityQueue<>((a, b) -> a.distance - b.distance); // Sort w.r.t their distances
        int[] visited = new int[V];
        int sum = 0;
        qu.add(new Pair(0, 0));

        while (!qu.isEmpty()) {
            Pair curr = qu.poll();
            int vaal = curr.node;
            int dist = curr.distance;

            if (visited[vaal] != 0)
                continue;
            visited[vaal] = 1;
            sum += dist;

            for (int i = 0; i < arr.get(vaal).size(); i++) {
                int dis = arr.get(vaal).get(i).distance;
                int vl = arr.get(vaal).get(i).node;
                if (visited[vl] == 0)
                    qu.add(new Pair(vl, dis));
            }
        }

        return sum;
    }
}
