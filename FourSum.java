package Leetcode;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<4){
            return result;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; ++i){
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target){
                break;
            }
            if(nums[i]+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1]<target){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length-2; j++){
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target){
                    break;
                }
                if(nums[i]+nums[j]+nums[nums.length-2]+nums[nums.length-1]<target){
                    continue;
                }
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                int low=j+1, high=nums.length-1;
                while(low<high){
                    int sum=nums[i]+nums[j]+nums[low]+nums[high];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low<high&&nums[low]==nums[low+1])low++; //skipping over duplicate on low
                        while(low<high&&nums[high]==nums[high-1])high--; //skipping over duplicate on high
                        low++;
                        high--;
                    }else if(sum<target){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,2,-5,0,-1,4};
        System.out.println(fourSum(arr,3));
    }
}