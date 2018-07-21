package Leetcode;

public class SecondMinNodeInBT {
    public int findSecondMinimumValue(TreeNode root) {
        int ans =  dfs(root,root.val,Integer.MAX_VALUE);
        return ans<Integer.MAX_VALUE?ans:-1;
    }
    public int dfs(TreeNode root,int min1,int min2){
        if (root!=null){
            if (min1==root.val){
                min2=dfs(root.left,min1,min2);
                min2=dfs(root.right,min1,min2);
            }
            if (root.val>min1&&root.val<min2) {
                min2 = root.val;
            }
        }
        return min2;
    }
}
