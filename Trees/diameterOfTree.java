package Trees;


public class diameterOfTree {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree_apna.BinaryTree tree = new tree_apna.BinaryTree();
        tree_apna.Node root = tree.buildTree(nodes);
        System.out.println(diameteroftree(root));
        System.out.println("-----------");
        System.out.println(diameter2(root).diam);
    }

    private static int diameteroftree(tree_apna.Node root) {
        if (root == null) return 0;
        int diam1 =diameteroftree(root.left);
        int diam2 = diameteroftree(root.right);
        int diam3 = height_of_tree_apna.heightOfNodes(root.left)+height_of_tree_apna.heightOfNodes(root.right)+1;

        return Math.max(diam3,Math.max(diam1,diam2)); //O(n^2)

    }

      //O(n)
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(tree_apna.Node root)
    {
        if (root == null) return new TreeInfo(0,0);
        TreeInfo left = diameter2((root.left));
        TreeInfo right = diameter2(root.right);

        int myheight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;

        int mydiam = Math.max(diam3,Math.max(diam1,diam2));

        TreeInfo res = new TreeInfo(myheight,mydiam);
        return res;
    }
}
