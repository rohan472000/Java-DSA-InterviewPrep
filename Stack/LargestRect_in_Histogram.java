package Stack;

import java.util.Stack;

public class LargestRect_in_Histogram {
    public static void main(String[] args) {
        int[] a = {2,1,5,6,2,3};
        System.out.println(maxArea(a));
    }
    static int maxArea(int[] a){
        int maxAns = 0;
        int ps[] = preSmall(a);
        int ns[] = nxtSmall(a);
        for (int i = 0; i < a.length; i++) {
            int curr = (ns[i]  - ps[i] - 1) * a[i];
            maxAns = Math.max(maxAns,curr);
        }
        return maxAns;
    }

    static int[] preSmall(int[] a){
        int[] ps = new int[a.length];
        Stack<Integer> s1  = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s1.isEmpty() && a[s1.peek()] >=  a[i]){
                s1.pop();
            }
            if (s1.isEmpty())
                ps[i] = -1;
            else
                ps[i] = s1.peek();
           s1.push(i);
            System.out.println("ps"+ps[i]);
        }

        return ps;
    }
    static int[] nxtSmall(int[] a){
        int[] ns = new int[a.length];
        Stack<Integer> s2  = new Stack<>();
        for (int i =  a.length-1; i >= 0; i--) {
            while (!s2.isEmpty() && a[s2.peek()] >= a[i]){
                s2.pop();
            }
            if (s2.isEmpty())
                ns[i] = a.length;
            else
                ns[i] = s2.peek();
            s2.push(i);
            System.out.println("ns"+ns[i]);
        }
        return ns;
    }
}
/*
* class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int cl =1 , cr = 1;
        for(int i=0;i<heights.length;i++){
            int left = i;
            int right = i;
            while(  left >= 0 && heights[left] >= heights[i] ){
                left--;
                cl++;
            }
            while( right < heights.length && heights[right] >= heights[i]  ){
                right++;
                cr++;
            }
            ///int maxm = Math.max(cl,cr);
            int maxm = (right - left - 1);
            int as = maxm * heights[i];
            if(as > ans){
               ans = as;
            }
        }
        return ans;

    }
}
* */