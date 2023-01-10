package Graphs;

public class graph {
    public static void main(String[] args) {
       graph g = new graph(4);
       g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }

    public String toSTring(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+"vertices , "+"  "+U+"edges"+"\n");
        for (int v = 0; v <V ; v++) {
            sb.append(v+" : ");
            for (int  w : matrix[v]
                 ) {
                sb.append(w+" ");
            }sb.append("\n");

        }return sb.toString();

    }
   private static int[][] matrix;
    private static int V;
    private static int U;
    public graph(int nodes){
        this.V=nodes;
        this.U=0;
        this.matrix = new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        this.matrix[u][v]=1;
        this.matrix[v][u]=1;
      U++;
    }
}
