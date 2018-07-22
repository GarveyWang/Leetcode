package Leetcode.Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (nums[mid]>target){
                e=mid-1;
            }else if (nums[mid]==target){
                return mid;
            }else {
                s=mid+1;
            }
        }
        return s;
    }
}
