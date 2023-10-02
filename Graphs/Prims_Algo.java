// --------------------------------PRIM'S ALGORITHM---------------------------------------------
// BASICALLY USED TO FIND OUT THE MST SUM OR THE MST TREE
// REQUIREMENTS:- PRIORITY QUEUE AND A vertexISITED ARRAY
// CONCEPTS:- vertexISITED ARRAY -> This Array will tell whether a node is visited or not.
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
        int vertex = 3;
        int edge = 3;
        // example -----> [[0,1,5],[1,2,3],[0,2,1]]
        int[][] arr = { { 0, 1, 5 }, { 1, 2, 3 }, { 0, 2, 1 } };
        int ans = prims(vertex, edge, arr);
        // Printing our result(Optional)
        System.out.print(ans);
        // Answer would come out as 4
    }

    static int prims(int vertex, int edge, int mat[][]) { // vertex =no. of vertices ,E =no. of mat ,mat =mat of each
                                                          // node
        ArrayList<ArrayList<Pair>> arr = new ArrayList<>();
        for (int i = 0; i < vertex; i++)
            arr.add(new ArrayList<>());
        for (int i = 0; i < edge; i++) {
            int parent = mat[i][0];
            int current = mat[i][1];
            int wt = mat[i][2];

            arr.get(parent).add(new Pair(current, wt));
            arr.get(current).add(new Pair(parent, wt));
        }

        PriorityQueue<Pair> qu = new PriorityQueue<>((a, b) -> a.distance - b.distance); // Sort w.r.t their distances
        int[] visited = new int[vertex];
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
