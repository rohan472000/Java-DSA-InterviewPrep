package Leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Flatten_multilevelArray {
    // public static void main(String[] args) {
      
    // }
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
        Node(){
            this.val = val;
            this.next = next;
            this.prev = prev;
            this.child = child;
        }
    };
    public Node flatten(Node head) {
    Node curr = head;
        Queue<Node> q = new ArrayDeque<>();
        while (head != null){
            if (head.child != null){
                if (head.next != null)q.add(head.next);
                head.next = head.child;
                head.next.prev = head;
                head.child = null;
            } else if (head.next == null && !q.isEmpty()) {
                head.next = q.remove();
                head.next.prev = head;
            }
            head = head.next;
        }
        return curr;
    }
}
