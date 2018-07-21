package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            return getSum(root,false,0);
        }

        public int getSum(TreeNode node,boolean isLeft,int sum){
            if (node==null){
                return sum;
            }
            if (node.left==null&&node.right==null&&isLeft){
                sum += node.val;
            }
            sum=getSum(node.left,true,sum);
            sum=getSum(node.right,false,sum);
            return sum;
        }
    }

}
