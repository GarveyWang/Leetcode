package Leetcode;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<=s.length()/k;++i){
            if(i%2==0){
                for (int j=Math.min(s.length()-1,i*k+k-1);j>=i*k;--j){
                    stringBuilder.append(s.charAt(j));
                }
            }else {
                for (int j=i*k;j<=Math.min(s.length()-1,i*k+k-1);++j){
                    stringBuilder.append(s.charAt(j));
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
}
