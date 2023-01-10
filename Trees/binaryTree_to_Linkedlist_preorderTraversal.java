package Trees;

import java.util.Stack;

public class binaryTree_to_Linkedlist_preorderTraversal {
    static class Node{
        int data;

        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    // Flatten Binary Tree to Linked List
static void treetoLL(Node root){
    if (root == null) return;
    Stack<Node> s = new Stack<>();
    s.push(root);

    while(!s.isEmpty()){
        Node curr = s.pop();
        if (curr.left != null){
            s.push(curr.left);
        }
        if (curr.right != null ){
            s.push(curr.right);
        }
        if (!s.isEmpty()){
            curr.right = s.peek();
        }
        curr.left = null;
    }

}

}
