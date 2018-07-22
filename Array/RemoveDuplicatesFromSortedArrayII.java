package Leetcode.Array;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0 || nums.length==1){
            return nums.length;
        }
        int writeIndex = 1;
        int lastNum = nums[0];
        int curCount = 1;
        int result = 1;
        for (int i=1;i<nums.length;++i){
            if (nums[i]==lastNum){
                ++curCount;
                if (curCount==2){
                    ++result;
                    nums[writeIndex++]=nums[i];
                }
            }else{
                lastNum=nums[i];
                curCount=1;
                ++result;
                nums[writeIndex++]=nums[i];
            }
        }
        return result;
    }
}
