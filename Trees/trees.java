package Trees;
import java.util.Scanner;
public class trees {
    static Scanner sc;
    public static void main(String[] args) {
         sc =  new Scanner(System.in);
         createTree();
    }
    static class Node{
        Node left,right;
        public int data;
        Node(int data){
            this.data = data;
        }
    }
    static Node createTree(){
        Node root = null;
        System.out.println("Enter data : ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("enter for Left : "+ data);
        root.left  = createTree();

        System.out.println("Enter for Right : "+ data);
        root.right = createTree();


        return root;
    }
    static void inOrder(Node root){
        if (root == null ) return;
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if (root == null ) return;
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if (root == null ) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }

}
