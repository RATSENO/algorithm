package example.programmers.가운데글자가져오기;

public class Solution {

    private static String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 0){//짝수
            return s.substring(s.length()/2-1, s.length()/2 + 1);
        }else{//홀수
            return s.substring(s.length()/2, s.length()/2 + 1);
        }
    }

    public static void main(String[] args) {
        String abcde = solution("abcde");
        String qwer = solution("qwer");
    }

}
