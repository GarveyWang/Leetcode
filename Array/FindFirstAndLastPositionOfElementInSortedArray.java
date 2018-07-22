package Leetcode.Array;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end && nums[start]!=nums[end]){
            int mid = start + (end-start)/2;
            if (nums[mid]<target){
                start = mid+1;
            }
            if (nums[mid]>target){
                end=mid-1;
            }
            if (nums[mid]==target){
                if (nums[start]!=target){
                    ++start;
                }
                if (nums[end]!=target){
                    --end;
                }
            }
        }
        if (start<=end && nums[start]==target){
            return new int[]{start,end};
        }else{
            return new int[]{-1,-1};
        }
    }
}
