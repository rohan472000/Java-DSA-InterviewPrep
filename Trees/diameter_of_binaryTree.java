package Trees;

public class diameter_of_binaryTree {
    static class Node{
        int data;

        Node left,right;
        Node(int data){
            this.data = data;
        }
    }

    static int diameter(Node root){
        if (root == null ) return 0;

        int dl = diameter(root.left);
        int dr = diameter(root.right);

        int curr = height(root.left) + height(root.right) + 1;
        return Math.max(curr, Math.max(dl,dr));
    }
    static int height(Node root){
        if (root == null ) return  0;
        return  1+Math.max(height(root.left), height(root.right));
    }

}
