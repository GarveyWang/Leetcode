package Leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res = new ArrayList<>();
        helper(res,new ArrayList<Integer>(),0,nums);
        return res;
    }

    private void helper(List<List<Integer>> res, ArrayList<Integer> list, int pos, int[] nums) {
        if (pos<=nums.length){
            res.add(new ArrayList<Integer>(list));
        }
        int i = pos;
        while (i<nums.length){
            list.add(nums[i]);
            helper(res,list,i+1,nums);
            list.remove(list.size()-1);
            ++i;
            while (i<nums.length && nums[i-1]==nums[i]){
                ++i;
            }
        }
    }
}
