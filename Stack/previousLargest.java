package Stack;

import java.util.Stack;

public class previousLargest {
    public static void main(String[] args) {
        int[] a = {3,4,23,7,6,2,1,98};
        prevLargest(a);
    }
     static void  prevLargest(int[] a){
         Stack<Integer> s = new Stack<>();
         for (int i = 0; i < a.length; i++) {
             while (!s.isEmpty() && s.peek()<=a[i]){
                       s.pop();
             }
             if (s.isEmpty()){
                 System.out.println("-1");
             }else {
                 System.out.println(s.peek());
             }
             s.push(a[i]);
         }

     }
}
