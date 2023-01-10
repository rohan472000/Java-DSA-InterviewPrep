package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeveOrder_Traversal_inBinaryTree {
    public static void main(String[] args) {

    }
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }

    // O(n^2) Solution
    static  void printLevelorder(Node root , int level ){
        if (root == null) return;
        if (level == 1) System.out.println( root.data+"");
        if (level > 1){
            printLevelorder(root.left , level-1);
            printLevelorder(root.right , level-1);
        }
    }

    // Optimized Solution
    static void LevelOrder(Node root){
        Queue<Node> q  =new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node curr = q.poll();

            if (curr == null) {
                if (q.isEmpty()) return;
                q.add(null);
                continue;
            }

            System.out.println(curr.data);
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    // Leetcode solution where return tpe is List<List<Integer>>
    static List<List<Integer>> levelOrde(Node root){
        Queue<Node> q = new LinkedList<Node>();
        List<List<Integer>> anslist = new LinkedList<List<Integer>>();
        if (root == null) return anslist;
        q.offer(root);

        while (!q.isEmpty()){
            int level = q.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null ) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                sublist.add(q.poll().data);

            }anslist.add(sublist);
        }return anslist;
    }
}
