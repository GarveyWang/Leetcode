package Leetcode;

import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hashSet=new HashSet<>();
        for (String str:words){
            StringBuilder stringBuilder=new StringBuilder();
            for (int i=0;i<str.length();++i){
                stringBuilder.append(morse[str.charAt(i)-'a']);
            }
            hashSet.add(stringBuilder.toString());
        }
        return hashSet.size();
    }
}
