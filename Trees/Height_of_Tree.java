package Trees;

import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class HeightOfTree {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeNode root = createTree();
        int treeHeight = height(root);
        System.out.println("Height of the tree is: " + treeHeight);
    }

    static TreeNode createTree() {
        System.out.print("Enter data (-1 to exit): ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        TreeNode root = new TreeNode(data);

        System.out.println("Enter left child of " + data + ": ");
        root.left = createTree();

        System.out.println("Enter right child of " + data + ": ");
        root.right = createTree();

        return root;
    }

    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
