package Leetcode.Array;

import java.util.Arrays;

public class MaxProductSubarray {

    public int maxProduct(int[] nums){
        return maxProduct(nums,Integer.MIN_VALUE);
    }

    public int maxProduct(int[] nums, int current) {
        if (nums.length==0){
            return current;
        }
        if (nums.length==1){
            return Math.max(nums[0],current);
        }
        int total = 1;
        for (int num:nums){
            total*=num;
        }
        if (total>0){
            return total;
        }else if (total<0){
            return Math.max(
                    maxProduct(Arrays.copyOfRange(nums,0,nums.length-1),total),
                    maxProduct(Arrays.copyOfRange(nums,1,nums.length),total)
            );
        }else{
            int split = 0;
            while (nums[split]!=0){
                ++split;
            }
            return Math.max(
                    maxProduct(Arrays.copyOfRange(nums,0,split),0),
                    maxProduct(Arrays.copyOfRange(nums,split+1,nums.length),0)
            );
        }
    }
}
