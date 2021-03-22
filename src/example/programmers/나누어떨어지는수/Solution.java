package example.programmers.나누어떨어지는수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp.add(arr[i]);
            }
        }

        if (temp.size() == 0) {
            temp.add(-1);
        }else {
            Collections.sort(temp);
        }

        answer = new int[temp.size()];
        for(int i=0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{5, 8, 7, 10}, 5);
    }
}
