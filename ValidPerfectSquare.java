package Leetcode;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int i=1;
        int temp=0;
        while (temp<num){
            temp+=i;
            i+=2;
        }
        return num==temp;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
}
