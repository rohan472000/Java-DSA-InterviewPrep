package Trees;

public class count_the_nodes {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree_apna.BinaryTree tree = new tree_apna.BinaryTree();
        tree_apna.Node root = tree.buildTree(nodes);
        System.out.println(countNodes(root));
    }
    public static int countNodes(tree_apna.Node root){
        if (root == null) return 0;
        int leftnode = countNodes(root.left);
        int rightnode = countNodes(root.right);
        return 1+leftnode+rightnode;
    }
}
