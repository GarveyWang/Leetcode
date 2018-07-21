package Leetcode;

import java.util.Arrays;

public class ConstructBTFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int split = 0;
        for (int i=0;i<inorder.length;++i){
            if (inorder[i]==preorder[0]){
                split=i;
                break;
            }
        }
        int[] leftPre = Arrays.copyOfRange(preorder,1,split+1);
        int[] leftIn = Arrays.copyOfRange(inorder,0,split);
        int[] rightPre = Arrays.copyOfRange(preorder,split+1,preorder.length);
        int[] rightIn = Arrays.copyOfRange(inorder,split+1,inorder.length);
        root.left = buildTree(leftPre,leftIn);
        root.right = buildTree(rightPre,rightIn);
        return root;
    }
}
