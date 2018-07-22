package Leetcode;

import java.util.HashSet;

public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>set = new HashSet<>();
        return dfs(root,k,set);
    }
    public boolean dfs(TreeNode root, int k, HashSet<Integer>set){
        if(root==null){
            return false;
        }
        if(set.contains(root.val)){
            return true;
        }
        set.add(k-root.val);
        return dfs(root.left,k,set)||dfs(root.right,k,set);
    }
}
