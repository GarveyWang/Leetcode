package Leetcode;

public class SumOfSquareNum {
    public boolean judgeSquareSum(int c) {
        for(long a=0;a*a<=c;++a){
            int b = c - (int)(a*a);
            if(binary_search(0,b,b)){
                return true;
            }
        }
        return false;
    }
    public boolean binary_search(long s,long e,long n){
        if(s>e){
            return false;
        }
        long mid = s+(e-s)/2;
        if(mid*mid==n){
            return true;
        }else if(mid*mid<n){
            return binary_search(mid+1,e,n);
        }else{
            return binary_search(s,mid-1,n);
        }
    }
}
