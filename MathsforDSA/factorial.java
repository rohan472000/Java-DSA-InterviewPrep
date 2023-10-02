public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcfact(n));
    }
    public static int calcfact(int n){
        if(n==1 || n==0)
           return 1;
        int fact_nm1 = calcfact(n-1);
        int ans = n * fact_nm1;
        return ans;
    }
}
