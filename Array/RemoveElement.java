package Leetcode.Array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int write = 0;
        int read = 0;
        while (read<nums.length){
            if (nums[read]!=val){
                nums[write++]=nums[read];
            }
            ++read;
        }
        return write;
    }
}
