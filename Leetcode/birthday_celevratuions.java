package Leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class birthday_celevratuions {
    public static void main(String[] args) {
        int a[]={4,8,2,8,9};
        System.out.println(birthday(a));

    }

    static int birthday(int a[]){
        int count=0;
        //ArrayList<Integer> b = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            if (!stack.contains(a[i])){
                stack.add(a[i]);
                count++;
            }
            else {
                if (stack.contains(a[i]))
                {
                    count--;
                }
            }
        }


        return count;

    }
}
