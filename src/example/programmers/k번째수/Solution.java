package example.programmers.k번째수;

import java.util.Arrays;

public class Solution {

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int row = commands.length;
        for(int i=0; i<row; i++){
            int[] copyOfRange = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(copyOfRange);
            int k = copyOfRange[commands[i][2] - 1];
            answer[i]=k;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,5,2,6,3,7,4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    }
}
