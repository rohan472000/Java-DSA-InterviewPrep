// --------------------------------FLOYD WARSHALL's ALGORITHM---------------------------------------------
// BASICALLY USED TO FIND SHORTEST PATH BETWEEN EACH AND EVERY NODE IN A GRAPH
// WIKI:- https://en.wikipedia.org/wiki/Floyd%E2%80%93Warshall_algorithm

import java.util.*;

public class FloydWarshall {
    public static void main(String[] args) {
        // example -----> [[0,1,43],[1,0,6],[-1,-1,0]]
        int[][] matrix = { { 0, 1, 43 }, { 1, 0, 6 }, { -1, -1, 0 } };
        shortest_distance(matrix); // Calling our function to implement algo

        // Printing our result(Optional)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Answer would come out as {{0,1,7},{1,0,6},{-1,-1,0}}
    }

    static void shortest_distance(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) { // We are going through each and every node here
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][via] != Integer.MAX_VALUE && matrix[via][j] != Integer.MAX_VALUE)
                        matrix[i][j] = Math.min(matrix[i][via] + matrix[via][j], matrix[i][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == Integer.MAX_VALUE)
                    matrix[i][j] = -1;
            }
        }
    }
}
