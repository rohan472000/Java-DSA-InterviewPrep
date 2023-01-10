package Stack;

import static Stack.LargestRect_in_Histogram.maxArea;

public class max_Rectangle {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int[][] m = {{0}};
        System.out.println(largestArea(m));
    }
    static int largestArea(int[][] a){
        int currRow[] = a[0];
        int maxAns = maxArea(currRow);

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1){
                    currRow[j]+=1;
                }else
                    currRow[j] = 0;
            }
            int currAns = maxArea(currRow);
            maxAns  = Math.max(maxAns,currAns);
        }
    return maxAns;
    }

}
