package Leetcode;

public class SqrtX {
    public static int mySqrt(int x) {
        return getSqrt(0,x,x);
    }
    public static int getSqrt(long s,long e,long x){
        if (s>e){
            return (int)e;
        }
        long mid=s+(e-s)/2;
        if (mid*mid==x){
            return (int)mid;
        }else if (mid*mid<x){
            return getSqrt(mid+1,e,x);
        }else {
            return getSqrt(s,mid-1,x);
        }
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
