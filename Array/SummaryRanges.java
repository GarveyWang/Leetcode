package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String>results = new ArrayList<>();
        if (nums.length==0){
            return results;
        }
        int start = nums[0];
        int end = nums[0];
        if (nums.length==1){
            results.add(String.valueOf(start));
            return results;
        }
        for (int i=1;i<nums.length;++i){
            if (nums[i]==end+1){
                ++end;
            }
            else{
                if (start==end){
                    results.add(String.valueOf(start));
                }else{
                    results.add(String.valueOf(start)+"->"+String.valueOf(end));
                }
                start = nums[i];
                end = nums[i];
            }
        }
        if (start==end){
            results.add(String.valueOf(start));
        }else{
            results.add(String.valueOf(start)+"->"+String.valueOf(end));
        }
        return results;
    }
}
