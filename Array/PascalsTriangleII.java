package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list = new ArrayList<>(rowIndex+1);
        list.add(1);
        for (int i=1;i<=rowIndex;++i){
            list.add(1);
            for (int j=list.size()-2;j>0;--j){
                list.set(j,list.get(j-1)+list.get(j));
            }
        }
        return list;
    }
}
