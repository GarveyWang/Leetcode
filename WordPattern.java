package Leetcode;


import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(strs.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String>map = new HashMap<>();
        for (int i=0;i<pattern.length();++i){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(strs[i])){
                    return false;
                }
            }else{
                if(map.containsValue(strs[i])){
                    return false;
                }
                map.put(pattern.charAt(i),strs[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
}
