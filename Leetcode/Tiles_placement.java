public class Tiles_placement {
    public static void main(String[] args) {
        System.out.println(tilesPlacement(2,2));
    }
    public  static  int tilesPlacement(int n,int m){
        if(n==m) return 2;
        if(n<m) return 1;

        //vertically
        int vertical = tilesPlacement(n-m,m);
        //horizontallyy
        int horizontal = tilesPlacement(n-1,m);
        return vertical+horizontal;
    }
}
