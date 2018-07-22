package Leetcode.Array;

import java.util.LinkedList;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int cur = 0;
        int energy = nums[0];
        while (energy>0&&cur<nums.length-1){
            --energy;
            ++cur;
            energy=Math.max(nums[cur],energy);
        }
        return cur==nums.length-1;
    }
}
