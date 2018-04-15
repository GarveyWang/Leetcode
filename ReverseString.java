package Leetcode;

public class ReverseString {
    public String reverseString(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length()/2;++i){
            char temp = arr[i];
            arr[i]=arr[s.length()-1-i];
            arr[s.length()-1-i]=temp;
        }
        return new String(arr);
    }
}
