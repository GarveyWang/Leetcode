package Leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (Character ch:s.toCharArray()){
            if (hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }else {
                hashMap.put(ch,1);
            }
        }
        for (Character ch:t.toCharArray()){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)-1);
            }else{
                return false;
            }
        }
        for (Character ch:hashMap.keySet()){
            if(hashMap.get(ch)!=0){
                return false;
            }
        }
        return true;
    }
}
