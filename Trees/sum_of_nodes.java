package Trees;

public class sum_of_nodes {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree_apna.BinaryTree tree = new tree_apna.BinaryTree();
        tree_apna.Node root = tree.buildTree(nodes);
        System.out.println(sumOfNodes(root));
    }
    public static int sumOfNodes(tree_apna.Node root){
        if (root == null) return 0;

        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);

        return leftsum+rightsum+root.data;
    }
}
