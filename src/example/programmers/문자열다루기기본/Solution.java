package example.programmers.문자열다루기기본;

public class Solution {
    public static boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6){
           try {
               Integer integer = Integer.valueOf(s);
               answer = true;
           }catch (NumberFormatException e){
               answer=false;
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        boolean a1234 = solution("a124");
    }
}
