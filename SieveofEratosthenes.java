public class SieveOfEranthatosis {
    public static void main(String[] args) {
        int n = 40;
        boolean[] arr = new boolean[n+1];
        sieve(n, arr);
    }
     // false is prime and true is non prime
    static void sieve(int n, boolean[] prime) {
        for (int i = 2; i*i <=n ; i++) {
            if (!prime[i]){
                for (int j =i*2 ; j <=n; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i < prime.length ; i++) {
           if (!prime[i]){
               System.out.println(i);
           }
        }
    }
}

