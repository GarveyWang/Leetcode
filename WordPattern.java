package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        if(pattern.length()!=strs.length){
            return false;
        }
        HashMap<String,Character> str2charMap=new HashMap<>();
        HashMap<Character,String> char2strMap=new HashMap<>();
        for (int i=0;i<pattern.length();++i){
            if(str2charMap.containsKey(strs[i])&&char2strMap.containsKey(pattern.charAt(i))){
                if((str2charMap.get(strs[i])==pattern.charAt(i))&&(char2strMap.get(pattern.charAt(i)).equals(strs[i]))){
                    continue;
                }else {
                    return false;
                }
            }else if ((!str2charMap.containsKey(strs[i]))&&(!char2strMap.containsKey(pattern.charAt(i)))){
                str2charMap.put(strs[i],pattern.charAt(i));
                char2strMap.put(pattern.charAt(i),strs[i]);
            }else {
                return false;
            }
        }
        return true;
    }
}
