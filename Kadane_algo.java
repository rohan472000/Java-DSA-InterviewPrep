/*
* maximum continuos sub-array
* */
public class Kadane_algo {
    public static void main(String[] args) {
   int a[] = {-2,-3,4,-1,-2,1,5,-3};
        int b[] = {1,2,3,-2,5};
   System.out.print(kadane(b));
    }
    static int max_sum=0;
    static int cur_sum=0;
    static int kadane(int[] a){
        for (int i = 0; i < a.length ; i++) {
           cur_sum = cur_sum + a[i];

           if (cur_sum > max_sum)
           {
              max_sum = cur_sum;
           }
           if (cur_sum < 0){
               cur_sum=0;
           }
        }
        return max_sum;
    }
}
