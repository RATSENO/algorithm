package example.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        //(){}[]
        for (char aChar : chars) {
            if(aChar =='('){
                stack.push(')');
            }else if(aChar=='{'){
                stack.push('}');
            }else if(aChar=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop() != aChar){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //isValid("()");
        isValid("(){}[]");
        isValid("(){}[");
        isValid("(");
    }
}
