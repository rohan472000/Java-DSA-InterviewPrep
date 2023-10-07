public class maxPath_inMaze {
    public static void main(String[] args) {
        System.out.println(maxPath(0,0,3,3));
    }
    public static int maxPath(int i,int j,int n,int m){
        if(i==n || j==m) return 0;
        if(i == n-1 && j == m-1) return 1;

        int downward = maxPath(i+1,j,n,m);
        int right = maxPath(i,j+1,n,m);
        return downward+right;
    }
}
