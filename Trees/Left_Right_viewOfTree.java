package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Left_Right_viewOfTree {
    public static void main(String[] args) {

    }
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static List<Integer> rightSideViewTree(Node root){

            Queue<Node> q = new LinkedList<>();
            List<Integer> l = new ArrayList<>();

            if (root == null) return l;
            q.offer(root);
            while(!q.isEmpty()){
                int level = q.size();
                for (int i = 0; i < level; i++) {
                    Node curr = q.remove();
                    if(i == level-1)
                        l.add(curr.data);
                    if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null)
                        q.add(curr.right);

                }
            }return l;
        }

    }

