package Trees;

public class height_of_tree_apna {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree_apna.BinaryTree tree = new tree_apna.BinaryTree();
        tree_apna.Node root = tree.buildTree(nodes);
        System.out.println(heightOfNodes(root));
    }

    static int heightOfNodes(tree_apna.Node root) {
        if (root == null) return 0;

        int leftheight = heightOfNodes(root.left);
        int rightheight = heightOfNodes(root.right);

        return Math.max(leftheight,rightheight)+1;
    }
}
