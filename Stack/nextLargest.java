package Stack;

import java.util.Stack;

public class nextLargest {
    public static void main(String[] args) {
        int[] a = {3,4,23,7,6,2,1,98};
        nextLarge(a);
    }
    static void nextLarge(int[] a){
        Stack<Integer> s = new Stack<>();
        for (int i = a.length-1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek()<=a[i])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                System.out.println("-1");
            }else {
                System.out.println(s.peek());
            }

            s.push(a[i]);
        }
    }
}
