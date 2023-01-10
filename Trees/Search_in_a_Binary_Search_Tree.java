package Trees;

public class Search_in_a_Binary_Search_Tree {
    public static void main(String[] args) {

    }
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    static Node searchBST(Node root, int val) {
       if (root == null || root.data == val) return root;

       if (root.data > val ) return searchBST(root.left, val);

       return searchBST(root.right,val);

       // OR
       /* while (root != null)
		{
			if ( val < root.val ) root = root.left;
			else if ( val > root.val ) root = root.right;
			else return root;
		}
		return root;*/
    }

}
