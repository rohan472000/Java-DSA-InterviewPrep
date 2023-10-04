import java.util.*;


class Graph {
    private int V;
    private Map<Integer, List<Integer>> adjacencyList; 

    // Constructor
    public Graph(int V) {
        this.V = V;
        this.adjacencyList = new HashMap<>();
        for (int i = 0; i < V; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
    } 
    public void addEdge(int v, int w) {
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
    }
    // Print the graph
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
        
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
      
        graph.printGraph();
    }
}
