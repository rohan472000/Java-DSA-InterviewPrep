package Leetcode;

public class Palindrome_fixedLength {
    public static void main(String[] args) {
        int[] queries = {1,2,3,4,5,90};int  intLength = 3;
        System.out.println(palindrome(1222222221));
        System.out.println(kthPalindrome(queries,intLength));
    }
    public static long[] kthPalindrome(int[] queries, int intLength) {
        long[] ans = new long[queries.length];
        int m = 0,n=0;
        for(long i =(long) Math.pow(10,intLength) ; i <=(long)(Math.pow(10,intLength+1)-1);i++){
            //System.out.println("sdfghj");
            if(n < queries.length && i == queries[n] && palindrome(i)==true){
                ans[m] = i;
                System.out.println(i);
                m++;
            }n++;
        }return ans;
    }
    public static  boolean palindrome(long x){
        long temp = x;
        long ans = 0;
        while(x > 0){
            long a = x % 10;
            ans = (ans * 10) + a;
            x = x/10;
        }

        return (ans == temp ? true : false);

    }
}
