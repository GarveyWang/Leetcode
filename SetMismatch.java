package Leetcode;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        boolean[] table=new boolean[nums.length+1];
        int repeat=0;
        int missing=0;
        for (int i=0;i<nums.length;++i){
            if (table[nums[i]]){
                repeat=nums[i];
            }else {
                table[nums[i]]=true;
            }
        }
        for (int i=1;i<table.length;++i){
            if (!table[i]){
                missing=i;
                break;
            }
        }
        return new int[]{repeat,missing};
    }
}
