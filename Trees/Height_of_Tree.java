package Trees;

import java.util.Scanner;

public class Height_of_Tree {
    static Scanner sc;
    public static void main(String[] args) {
          sc  = new Scanner(System.in);
    }
    static class Node{
        static Node left,right;
        public static int data;
        Node(int data){
            this.data = data;
        }
    }
    static Node createNode(){
        Node root = null;
        System.out.println("Enter data : ");
        int data= sc.nextInt();

        if (data == -1) return null;

         root = new Node(data);

        System.out.println("Enter left : "+data);
        root.left = createNode();

        System.out.println("Enter Right : "+data);
        root.right = createNode();
        return root;
    }
    static int height(Node root){
        if (root == null)
            return  0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}
