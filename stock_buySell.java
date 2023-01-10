public class stock_buySell {
    public static void main(String[] args) {
        int a[] = {3,1,4,8,9,2,5};
        System.out.println();
        System.out.print(stocks(a));
    }
    //static int max_profit=0;
    //static int min_soFar=0;
    static int stocks(int a[]){
         int max_profit=0;
         int min_soFar=a[0];
        for (int i = 0; i < a.length; i++) {
           min_soFar = Math.min(min_soFar,a[i]);
           int profit = a[i] - min_soFar;
           max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
