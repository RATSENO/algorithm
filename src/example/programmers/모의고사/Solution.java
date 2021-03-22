package example.programmers.모의고사;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
    // 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
    private static int[] solution(int[] answers) {
        int[] player1 = { 1, 2, 3, 4, 5 };
        int[] player2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] player3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        int[] answer = new int[] {0,0,0};
        int maxNum = 0;

        List<Integer> countNum = new ArrayList<Integer>();

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == player1[i%5]) {
                answer[0]++;
            }

            if(answers[i] == player2[i%8]) {
                answer[1]++;
            }

            if(answers[i] == player3[i%10]) {
                answer[2]++;
            }
        }

        for(int i : answer) {
            if(i > maxNum) {
                maxNum = i;
            }
        }

        for(int i=0; i<3; i++) {
            if(answer[i] == maxNum) {
                countNum.add(i+1);
            }
        }
        //Stream<Integer>목록에서 가져오기
        //IntStream각 요소를 자체에 매핑하여 (identity function) int각 Integer객체가 보유한 값을 unboxing하여 획득
        return countNum.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 2, 3, 4, 5});
        int[] solution1 = solution(new int[]{1, 3, 2, 4, 2});
    }
}
