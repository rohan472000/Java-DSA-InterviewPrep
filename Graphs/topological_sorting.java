import java.util.*;

public class topological_sorting {
    
    int v;
    LinkedList adj[];

    topological_sorting(int v){

        V=v;
        adj = new LinkedList[v];

        for(int i=0; i<v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void topologicalSortHelp(int v, Stack<Integer> stack, boolean visited[]){

        visited[v]=true;

        for(int neighbor : adj[v]){
            if(!visited[neighbor])
                topologicalSortHelp(neighbor, stack, visited);
        }
        stack.push(v);
    }

    void topologicalSort() {

        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[v];
        
        for(int i=0; i<V; i++) {
            if(!visited[i]) {
                topologicalSortHelp(i, stack, visited);
            }
        }
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }

    public static void main(String[] args) {

        Graph g = new Graph(6);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Topological Sort of the Graph:");
        g.topologicalSort();
    }
}

