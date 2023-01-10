package Leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Stack_using_twoQueue {
    public static void main(String[] args) {
   MyStack m = new MyStack();
   m.pushS(1);
        m.pushS(2);
        m.pushS(3);
        m.popS();


    }

    public static  class MyStack{
        static Queue q1  = new ArrayDeque<>();
        static Queue q2 =  new ArrayDeque<>();
        static void pushS(int data){
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            System.out.println(data);
            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        static void popS(){
            System.out.println(q1.remove()+ " deleted");
        }
    }
}
