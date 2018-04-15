package Leetcode;

public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null){
            return false;
        }
        if (equals(s,t)){
            return true;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);

    }
    public boolean equals(TreeNode x, TreeNode y){
        if (x==null&&y==null){
            return true;
        }
        if (x==null||y==null){
            return false;
        }
        if (x.val==y.val){
            return equals(x.left,y.left)&&equals(x.right,y.right);
        }
        return false;
    }
}
