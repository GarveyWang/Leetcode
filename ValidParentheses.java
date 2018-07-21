package Leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for (Character ch:s.toCharArray()){
            switch (ch){
                case '(': case '{': case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty()|| !stack.pop().equals('(')){
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()|| !stack.pop().equals('[')){
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()|| !stack.pop().equals('{')){
                        return false;
                    }
                    break;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}
