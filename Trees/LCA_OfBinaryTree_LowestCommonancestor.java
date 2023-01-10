package Trees;

public class LCA_OfBinaryTree_LowestCommonancestor {
    public static void main(String[] args) {

    }
    public class TreeNode {
     int val;
      TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }}
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == p || root == q || root == null) return root;
        TreeNode left = lowestCommonAncestor( root.left,  p,  q);
        TreeNode right = lowestCommonAncestor( root.right,  p,  q);
        if(left == null)
            return right;
        else if (right == null)
            return left;
        else
            return root;


        // below codes need some edge cases otherwise it is showing parameter is null as it finds p or q or root as null
        /*if( p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        else if( p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p,q);
        else return root; */


    }
}
