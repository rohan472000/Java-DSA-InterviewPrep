package Trees;

import java.util.Scanner;

public class Max_Min_ina_Tree {
     static Scanner sc ;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
    }
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static Node createTree(){
        Node root = null;
        System.out.println("enter the root : " );
        int data = sc.nextInt();

        if (data == -1) return null;

        System.out.println("enter the left : "+data);
        root.left = createTree();
        System.out.println("enter the right : "+data);
        root.right = createTree();


        return root;
    }

    static int maximum(Node root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
    }
}
