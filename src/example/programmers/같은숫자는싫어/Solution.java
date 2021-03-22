package example.programmers.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static int[] solution(int []arr) {
        List<Integer> arrayList = new ArrayList<>();
        int tempValue = 10;
        for (int i=0; i<arr.length; i++){
            int value = arr[i];
            if(tempValue != value){
                arrayList.add(value);
            }
            tempValue=value;
        }
        int[] answer = new int[arrayList.size()];
        int idx=0;
        for (int i : arrayList) {
            answer[idx++]=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        int[] solution1 = solution(new int[]{4, 4, 4, 3, 3});
    }
}
