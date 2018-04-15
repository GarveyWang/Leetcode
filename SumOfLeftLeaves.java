package Leetcode;

public class SumOfLeftLeaves {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public int sumOfLeftLeaves(TreeNode root) {
        return getSum(root,true,0);
    }

    public int getSum(TreeNode node,boolean isLeft,int sum){
        if (node==null){
            return sum;
        }
        if (node.left==null&&node.right==null&&isLeft){
            sum += node.val;
        }
        getSum(node.left,true,sum);
        getSum(node.right,false,sum);
        return sum;
    }

}
