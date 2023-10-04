import java.util.*;

// Class to represent a graph
class Graph {
    private int V; // Number of vertices
    private Map<Integer, List<Integer>> adjacencyList; // Adjacency list

    // Constructor
    public Graph(int V) {
        this.V = V;
        this.adjacencyList = new HashMap<>();
        for (int i = 0; i < V; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
    }

    // Add an edge to the graph
    // This method adds an undirected edge between vertices v and w
    // For more details, see: https://en.wikipedia.org/wiki/Graph_(discrete_mathematics)
    public void addEdge(int v, int w) {
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
    }

    // Print the graph
    // This method prints the adjacency list representation of the graph
    // For more details, see: https://en.wikipedia.org/wiki/Adjacency_list
    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            int vertex = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            System.out.print("Vertex " + vertex + " is connected to: ");
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class ImplementingGraphs {
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        // For more details, see: https://en.wikipedia.org/wiki/Graph_theory
        Graph graph = new Graph(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        graph.printGraph();
    }
}
