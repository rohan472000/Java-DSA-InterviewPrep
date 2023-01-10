package Leetcode;

import java.util.Stack;

public class Queue_using_twostacks {
    public static void main(String[] args) {
      MyQueue m = new MyQueue();
       m.pushQ(1);
      m.pushQ(2);
      m.pushQ(3);
      m.popQ();




    }
    public static class MyQueue {
        static Stack<Integer> st1 = new Stack<>();
        static Stack<Integer> st2 = new Stack<>();

        static void pushQ(int data) {
            st1.push(data);
            System.out.println(data);
        }


         static int popQ() {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            int ans = st2.pop();
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
             System.out.println(ans + " deleted");
            return ans;
        }
    }
}
