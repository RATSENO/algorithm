package example.codility;

import java.util.Stack;

public class Nesting {

    static int solution(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '('){
                stack.push(c);
            }else if(stack.size() ==0 || stack.pop() == c){
                return 0;
            }
        }

        return stack.size() > 0 ? 0 : 1;
    }

    public static void main(String[] args) {
        int res = solution("(()(())())");
    }
}
