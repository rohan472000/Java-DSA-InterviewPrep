// --------------------------------FLOYD WARSHALL's ALGORITHM---------------------------------------------
// BASICALLY USED TO FIND SHORTEST PATH BETWEEN EACH AND EVERY NODE IN A GRAPH

public class FloydWarshall {
    public void shortest_distance(int[][] matrix) {
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
