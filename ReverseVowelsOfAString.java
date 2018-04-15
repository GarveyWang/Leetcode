package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class ReverseVowelsOfAString {
    public static boolean isVowerl(char ch){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public static String reverseVowels(String s) {
        LinkedList<Character>linkedList=new LinkedList<>();
        for (int i=0;i<s.length();++i){
            if(isVowerl(s.charAt(i))){
                linkedList.push(s.charAt(i));
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<s.length();++i){
            if(isVowerl(s.charAt(i))){
                stringBuilder.append(linkedList.pop());
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
