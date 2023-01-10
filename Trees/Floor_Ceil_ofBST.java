package Trees;

public class Floor_Ceil_ofBST {
    class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public int floor(Node root, int key){
        int ans = Integer.MAX_VALUE;
        while (root != null){
            if (root.data == key || root == null) return root.data;
            else if (root.data > key) {
                root = root.left;
            }else {
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }
    public int ceil(Node root, int key){
        int ans = Integer.MIN_VALUE;
        while (root != null){
            if (root.data == key || root == null) return root.data;
            else if (root.data > key) {
                ans = root.data;
                root = root.left;
            }else {
                root = root.right;
            }
        }
        return ans;
    }
}

