package example.programmers.문자열내맘대정렬하기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] solution = solution(new String[]{"sen", "bed", "car"}, 1);
    }
}
