package Trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteNodes_returnForest {
    public static void main(String[] args) {
        //System.out.println(Integer.);

    }
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val = val;
            this.left = left;
                    this.right =right;
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> remaining = new ArrayList<>();
        Set<Integer> toDelete = new HashSet<>();
        for (int i:to_delete) {
            toDelete.add(i);
        }
        removeNode(root, toDelete,remaining);
        if (!toDelete.contains(root.val)){
            remaining.add(root);
        }
        return remaining;
    }

    private TreeNode removeNode(TreeNode root, Set<Integer> toDelete, List<TreeNode> remaining) {
     if (root == null)
         return null;
     root.left  = removeNode(root.left,toDelete,remaining);
     root.right = removeNode(root.right,toDelete,remaining);
     if (toDelete.contains(root.val)){
         if (root.left != null)
             remaining.add(root.left);
         if (root.right != null)
             remaining.add(root.right);
         return null;
     }
     return root;
    }

}
