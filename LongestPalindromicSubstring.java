package Leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbb"));
    }

    public static String longestPalindrome(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()];
        for (int i=0;i<s.length();++i){
            dp[i][i]=true;
            for (int delta=1;i-delta>=0&&i+delta<s.length()&&s.charAt(i-delta)==s.charAt(i+delta);++delta){
                dp[i-delta][i+delta]=true;
            }
        }
        for (int i=1;i<s.length();++i){
            if (s.charAt(i)==s.charAt(i-1)){
                dp[i-1][i]=true;
                for (int delta=1;i-1-delta>=0&&i+delta<s.length()&&s.charAt(i-1-delta)==s.charAt(i+delta);++delta){
                    dp[i-1-delta][i+delta]=true;
                }
            }
        }
        for (int j=s.length()-1;j>=0;--j){
            for (int jj=j,i=0;jj<s.length();++jj,++i){
                if (dp[i][jj]){
                    return s.substring(i,jj+1);
                }
            }
        }

        throw new AssertionError();
    }
}