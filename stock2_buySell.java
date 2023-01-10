public class stock2_buySell {
    public static void main(String[] args) {
        int b[] = {5,2,7,3,6,1,2,4};
        System.out.println(stock(b));
    }
    static int max_profit=0;
    static int final_profit=0;
    static int stock(int a[]){
        for (int i = 1; i < a.length; i++) {
            if( a[i] > a[i-1]){
                max_profit= a[i] - a[i-1];
                final_profit =  final_profit + max_profit;
            }
        }
        return final_profit;
    }
}
