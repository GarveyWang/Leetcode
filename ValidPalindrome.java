package Leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start<end){
            while (start<end && !Character.isLetterOrDigit(s.charAt(start))){
                ++start;
            }
            while (start<end && !Character.isLetterOrDigit(s.charAt(end))){
                --end;
            }
            if (Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))){
                ++start;
                --end;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
