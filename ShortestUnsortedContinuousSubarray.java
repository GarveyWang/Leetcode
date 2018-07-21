package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] copy=nums.clone();
        Arrays.sort(copy);
        int start=copy.length;
        int end=0;
        for (int i=0;i<copy.length;++i){
            if (copy[i]!=nums[i]){
                start=i;
                break;
            }
        }
        for (int j=copy.length-1;j>=0;--j){
            if (copy[j]!=nums[j]){
                end=j;
                break;
            }
        }
        if (end<=start)
            return 0;
        return end-start+1;
    }
    public static int findUnsortedSubarray2(int[] nums) {
        Stack < Integer > stack = new Stack < Integer > ();
        int l = nums.length, r = 0;
        boolean flag=true;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                l = Math.min(l, stack.pop());
                flag=false;
            }
            if(flag)
                stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(l);
        stack.clear();
        flag=true;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                flag=false;
                r = Math.max(r, stack.pop());
            }
            if(flag)
                stack.push(i);
        }
        return r - l > 0 ? r - l + 1 : 0;
    }

    public static void main(String[] args) {
        findUnsortedSubarray2(new int[]{2,6,4,8,10,9,15});
    }
}
