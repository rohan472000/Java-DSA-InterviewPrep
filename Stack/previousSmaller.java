package Stack;

import java.util.Stack;

public class previousSmaller {
    public static void main(String[] args) {
       int[] a = {3,4,23,7,6,2,1,98};
        prevSmaller(a);
    }
    static  void prevSmaller(int[] a){
        Stack<Integer> st  = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.isEmpty() && st.peek()>=a[i]){
                st.pop();
            }
            if (st.isEmpty()){
                System.out.println("-1");
            }else {
                System.out.println(st.peek());
            }
            st.push(a[i]);
        }
    }
}
