package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> results = new ArrayList<>();
        combination(results,new ArrayList<Integer>(),k,n,1);
        return results;
    }

    public void combination(List<List<Integer>>results,List<Integer>list,int k,int n, int start){
        if (list.size()==k && n==0){
            List<Integer> result = new ArrayList<>(list);
            results.add(result);
            return;
        }
        for (int i=start;i<=9;++i){
            list.add(i);
            combination(results,list,k,n-i,i+1);
            list.remove(list.size()-1);
        }
    }
}
