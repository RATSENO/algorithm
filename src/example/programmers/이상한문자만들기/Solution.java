package example.programmers.이상한문자만들기;

public class Solution {
    public static String solution(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(' ');
                index = 0;
            } else {
                if(index % 2 != 0) {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                    index ++;
                } else {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    index ++;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String try_hello_world = solution("try hello world");
    }
}
