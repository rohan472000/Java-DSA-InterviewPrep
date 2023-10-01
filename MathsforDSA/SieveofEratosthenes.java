/* Description:
The Sieve of Eratosthenes is a method to find all prime numbers up to a given limit
    Make a list of numbers from 2 to your limit.
Start with the first number (2) and mark it as prime.
Cross out all multiples of 2 in the list.
Move to the next unmarked number (3) and mark it as prime.
Cross out all multiples of 3 in the list.
Repeat steps 4 and 5 until you've checked numbers up to the square root of the limit.
The remaining unmarked numbers are all prime.
For example, if you want to find primes up to 30, you'll get: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]. It's an efficient way to find prime numbers.
    Want to know more here is the wikipedia link  https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes */
// Time complexity is O(n) how? check it out https://www.geeksforgeeks.org/how-is-the-time-complexity-of-sieve-of-eratosthenes-is-nloglogn/
// and Space complexity is O(n).
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

