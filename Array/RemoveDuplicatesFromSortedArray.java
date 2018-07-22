package Leetcode.Array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int last = nums[0], read = 1, write = 1;
        while (read<nums.length){
            if (nums[read]==last){
                ++read;
            }else{
                nums[write++]=nums[read];
                last = nums[read];
            }
        }
        return write;
    }
}
