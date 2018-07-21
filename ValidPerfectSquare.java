package Leetcode;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int i = 1;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
}
