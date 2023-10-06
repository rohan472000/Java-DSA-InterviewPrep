import java.util.Arrays;

public class DijkstraAlgorithm {
    private static final int INFINITY = Integer.MAX_VALUE;
    private static final int NO_PATH = -1;

    public static void main(String[] args) {
        testDijkstra();
    }

    private static void testDijkstra() {
        int[][] graph1 = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int startNode1 = 0;
        runDijkstra(graph1, startNode1);

        int[][] graph2 = {
            {0, 3, 0, 0, 0, 0, 0, 4},
            {3, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 8, 0, 0, 0, 0},
            {0, 0, 8, 0, 2, 0, 0, 0},
            {0, 0, 0, 2, 0, 6, 0, 0},
            {0, 0, 0, 0, 6, 0, 7, 0},
            {0, 0, 0, 0, 0, 7, 0, 9},
            {4, 0, 0, 0, 0, 0, 9, 0}
        };
        int startNode2 = 2;
        runDijkstra(graph2, startNode2);

        int[][] graph3 = {
            {0, 2, 4, 0, 0, 0},
            {2, 0, 1, 7, 0, 0},
            {4, 1, 0, 0, 3, 0},
            {0, 7, 0, 0, 0, 1},
            {0, 0, 3, 0, 0, 5},
            {0, 0, 0, 1, 5, 0}
        };
        int startNode3 = 0;
        runDijkstra(graph3, startNode3);
    }

    private static void runDijkstra(int[][] graph, int startNode) {
        Graph g = new Graph(graph);
        System.out.println("Graph:");
        g.printGraph();

        System.out.println("\nShortest distances from Node " + startNode + ":");
        int[] shortestDistances = g.dijkstra(startNode);
        printShortestDistances(shortestDistances);
        System.out.println("-------------------------");
    }

    private static void printShortestDistances(int[] dist) {
        System.out.println("Shortest distances:");
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == INFINITY) {
                System.out.println("To " + i + ": No Path");
            } else {
                System.out.println("To " + i + ": " + dist[i]);
            }
        }
    }
}

class Graph {
    private final int[][] graph;

    public Graph(int[][] graph) {
        this.graph = graph;
    }

    public int[] dijkstra(int startNode) {
        int vertices = graph.length;
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(dist, INFINITY);
        dist[startNode] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INFINITY &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        return dist;
    }

    private int minDistance(int[] dist, boolean[] visited) {
        int min = INFINITY;
        int minIndex = -1;

        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] < min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public void printGraph() {
        for (int[] row : graph) {
            System.out.println(Arrays.toString(row));
        }
    }
}
