package example.programmers.문자열을정수로바꾸기;

public class Solution {
    public static int solution(String s) {
        int answer = new Integer(s);
        return answer;
    }

    public static void main(String[] args) {
        int solution = solution("1234");
        int solution1 = solution("-1234");
    }
}
