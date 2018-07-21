package Leetcode;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return target == nums[0];
        }
        int deviation = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] > nums[i]) {
                deviation = i;
            }
        }
        return binarySearch(nums,target,0,deviation)||binarySearch(nums,target,deviation,nums.length);
    }

    public boolean binarySearch(int[] nums, int target, int low, int high) {
        if (low >= high) {
            return false;
        }
        int mid = low+(high-low)/2;
        if (nums[mid] == target) {
            return true;
        }
        if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, high);
        }else{
            return binarySearch(nums, target, low, mid);
        }
    }

    public static void main(String[] args) {
    }
}
