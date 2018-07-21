package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNum {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=left;i<=right;++i){
            boolean flag=true;
            String s=String.valueOf(i);
            for (int j=0;j<s.length();++j){
                int devision=Integer.valueOf(s.substring(j,j+1));
                if (devision==0||i%devision!=0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                list.add(i);
            }
        }
        return list;
    }
}
