package Trees;

public class valid_BST {
    public static void main(String[] args) {

    }
    static class Node{
        Node left,right;
        public int data;
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(Node root){
        return  validate(root, null ,null);
    }
    public boolean validate(Node root, Integer  max, Integer min){
        if (root == null)
            return true;
        else if (max!= null && root.data>=max ||  min!=null && root.data < min) {
            return false;
        }else {
            return validate(root.left,root.data,min)&&validate(root.right,max,root.data);
        }
    }
}
