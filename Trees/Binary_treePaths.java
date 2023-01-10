package Trees;

import java.util.ArrayList;
import java.util.List;

public class Binary_treePaths {
    public static void main(String[] args) {

    }
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static List<String> BinaryTreePaths(Node root){
        List<String> result = new ArrayList<>();
        if (root == null ) return result;

        String curr_paths = Integer.toString(root.data);
        if (root.left == null  && root.right == null ) result.add(curr_paths);

        if (root.left != null) dfs(root.left,curr_paths,result);
        if (root.right != null) dfs(root.right,curr_paths,result);


        return result;
    }

    private static void dfs(Node node, String curr_paths, List<String> result) {
        curr_paths += "->"+  node.data;

        if (node.left == null && node.right == null){
            result.add(curr_paths);
            return;
        }
        if (node.left != null ) dfs(node.left, curr_paths,result);
        if (node.right != null ) dfs(node.right,curr_paths,result);


    }
}
