package example.programmers.두개뽑아서더하기;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    private static int[] solution(int[] numbers) {
        int[] answer = {};
        //validation - 1
        if(numbers.length<2 || numbers.length>100){
            return answer;
        }
        HashSet<Integer> sumSet = new HashSet<>();
        for(int i=0; i< numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                //validation - 2
                if(numbers[i]<0 || numbers[i]>100){
                    return answer;
                }
                sumSet.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[sumSet.size()];

        int i = 0;
        for (Integer integer : sumSet) {
            answer[i++] = integer;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{2, 1, 3, 4, 1});
        int[] solution1 = solution(new int[]{5, 0, 2, 7});
        int[] solution2 = solution(new int[]{});
        int[] solution3 = solution(new int[]{-1, 1, 2});
        int[] solution4 = solution(new int[]{1, 2, 3, 101});
    }
}
