package Leetcode;

public class TrimBSTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root==null){
            return null;
        }
        if(root.val<L){
            root = trimBST(root.right,L,R);
        }
        if(root.val>R){
            root = trimBST(root.left,L,R);
        }
        root.left = trimBST(root.left,L,R);
        root.right = trimBST(root.right,L,R);
        return root;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
}
