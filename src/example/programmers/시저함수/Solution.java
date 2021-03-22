package example.programmers.시저함수;

public class Solution {
    public static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            //a b c d e f g h i j k l m n o p q r s t u v w x y z a
            //순환 하기때문에 26으로 나눈다
            if (Character.isLowerCase(ch)) {
                ch = (char) ('a' + (ch + n - 'a') % 26);
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ('A' + (ch + n - 'A') % 26);
            }
            answer += ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        String ab = solution("AB", 1);
        String z = solution("z", 1);
        String a_b_z = solution("a B z", 4);
    }
}
