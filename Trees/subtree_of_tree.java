package Trees;

public class subtree_of_tree {
    private static boolean subtreeoftree(tree_apna.Node root,tree_apna.Node subroot){
        if (subroot == null) return true;
        if (root == null) return false;
        if (root.data == subroot.data){
            if (isIdentical(root,subroot)) return true;
        }

        return subtreeoftree(root.left,subroot) || subtreeoftree(root.right,subroot);
    }

    private static boolean isIdentical(tree_apna.Node root, tree_apna.Node subroot) {
      if (root == null && subroot == null) return true;
      if (root == null || subroot == null) return false;

      if(root.data == subroot.data) return isIdentical(root.left,subroot.left) && isIdentical(root.right,subroot.right);
      return false;
    }
}
