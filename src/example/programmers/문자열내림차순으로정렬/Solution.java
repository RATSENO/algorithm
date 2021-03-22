package example.programmers.문자열내림차순으로정렬;

import java.util.Arrays;

public class Solution {
    public static String solution(String s){
        StringBuilder stringBuilder = new StringBuilder("");
        String[] split = s.split("");
        Arrays.sort(split);
        for (String s1 : split) {
            stringBuilder.append(s1);
        }
        return stringBuilder.reverse().toString();
    }
    /*
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array);
        Collections.reverse(Arrays.asList(array));
        return  String.join("",array);
    }
    */
    public static void main(String[] args) {
        String zbcdefg = solution("Zbcdefg");
    }
}
