package example.codility;

import java.util.Stack;

public class Brackets {

    static int solution(String s){
        Stack<Character> stack = new Stack<>();


        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return 0;
                }

                char last = stack.pop();

                if(c==')' && last != '('){
                    return 0;
                }

                if(c=='}' && last != '{'){
                    return 0;
                }

                if(c==']' && last != '['){
                    return 0;
                }
            }
        }

        if(!stack.isEmpty()){
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int res = solution("{[()()]}");
    }
}
