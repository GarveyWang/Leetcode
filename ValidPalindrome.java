package Leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int end=s.length()-1;
        while (start<=end){
            while (start<=end && !Character.isLetterOrDigit(s.charAt(start))){
                ++start;
            }
            while (end>=start && !Character.isLetterOrDigit(s.charAt(end))){
                --end;
            }
            if (start<s.length() && Character.isLetterOrDigit(s.charAt(start))&&Character.isLetterOrDigit(s.charAt(end))){
                if (Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))){
                    ++start;
                    --end;
                    continue;
                }else {
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
}
