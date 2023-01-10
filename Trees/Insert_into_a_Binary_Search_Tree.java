package Trees;

public class Insert_into_a_Binary_Search_Tree {
    public static void main(String[] args) {

    }
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public Node insertIntoBST(Node root, int val) {
    if (root == null ) return new Node(val);

    if (root.data > val)
        root.left = insertIntoBST(root.left,val);
    else if (root.data < val)
        root.right = insertIntoBST(root.right, val);

    return root;


    }

}
