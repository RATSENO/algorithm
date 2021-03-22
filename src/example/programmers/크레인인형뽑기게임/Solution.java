package example.programmers.크레인인형뽑기게임;

import java.util.Stack;

public class Solution {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        //행
        int row = board.length;
        //열
        int col = board[0].length;

        Stack<Integer> stack = new Stack<>();

        for (int position : moves) {
            //moves에 들어있는 값을 실제 배열에서 사용할 값으로 바꾼다. - 열
            int realPosition = position -1;

            for(int i=0; i<row; i++){
                //열을 정해져있기 때문에(moves) 행에서 찾는다.
                int value = board[i][realPosition];
                if(value>0){
                    //인형뽑기 개념이기때문에(stack) 뺀값은 0으로 처리(뽑은것)
                    board[i][realPosition] = 0;
                    if(stack.size()==0){
                        stack.push(value);
                        break;
                    }else{
                        Integer lastValue = stack.peek();
                        if(lastValue == value){
                            stack.pop();
                            answer += 2;
                            break;
                        }else{
                            stack.push(value);
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        //{ {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,4,4,4,2}, {3,5,1,3,1} }
        int solution = solution(
                new int[][]{
                //      [X,0] [X,1] [X,2] [X,3] [X,4]
                        {0,   0,    0,    0,    0},    //[0][X]
                        {0,   0,    1,    0,    3},    //[1][X]
                        {0,   2,    5,    0,    1},    //[2][X]
                        {4,   4,    4,    4,    2},    //[3][X]
                        {3,   5,    1,    3,    1}     //[4][X]
                        },
                new int[]{1, 5, 3, 5, 1, 2, 1, 4});
    }
}
