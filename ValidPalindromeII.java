package Leetcode;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while (left<=right){
            if (s.charAt(left)==s.charAt(right)){
                ++left;
                --right;
            }else {
                if (isValid(s,left,right-1)||isValid(s,left+1,right)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;

    }

    public boolean isValid(String s,int left,int right){
        while (left<=right){
            if (s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
