package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        for (int num:nums){
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> list:lists){
                List<Integer> newList = new ArrayList<>(list);
                newList.add(num);
                tmp.add(newList);
            }
            lists.addAll(tmp);
        }
        return lists;
    }
}