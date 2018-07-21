package Leetcode;

import java.util.Arrays;

public class ConstructBTFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int split = 0;
        for (int i = 0; i < inorder.length; ++i) {
            if (inorder[i] == root.val) {
                split = i;
                break;
            }
        }
        int[] leftIn = Arrays.copyOfRange(inorder, 0, split);
        int[] leftPost = Arrays.copyOfRange(postorder, 0, split);
        int[] rightIn = Arrays.copyOfRange(inorder, split + 1, inorder.length);
        int[] rightPost = Arrays.copyOfRange(postorder, split, postorder.length-1);
        root.left = buildTree(leftIn, leftPost);
        root.right = buildTree(rightIn, rightPost);
        return root;
    }
}
