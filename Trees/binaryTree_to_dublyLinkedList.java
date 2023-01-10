package Trees;

public class binaryTree_to_dublyLinkedList {
    public static void main(String[] args) {

    }

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static Node prev=null,head=null;
    static void converttoDLL(Node root){
        if (root == null) return;

        converttoDLL(root.left);
        if (prev == null) head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        converttoDLL(root.right);
    }
}
