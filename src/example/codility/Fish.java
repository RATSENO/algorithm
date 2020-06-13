package example.codility;

import java.util.Stack;

public class Fish {

    static int solution(int[] A, int[] B){
        //B >>>> 0은 상류, 1은 하류

        Stack<Integer> downFish = new Stack<>();

        int cnt = 0;

        for(int i = 0; i < A.length; i++){

            //0 >> 상류로 가는 물고기
            if(B[i] == 0 ){
                // 하류로 가는 물고기가 없고 상류로 가는 물고기
                if(downFish.size() == 0){
                    cnt++;
                }
                else{
                    //상류로 가는 물고기가 죽을때까지 비교
                    while(downFish.size() > 0){
                        if(downFish.peek() > A[i]){
                            break;
                        }
                        else{
                            downFish.pop();
                        }
                    }
                    // 하류로 가는 물고기 모두 잡아먹힌 경우 ++
                    if(downFish.empty()){
                        cnt++;
                    }
                }
            }

            //하류로 가는 물고기
            else{
                downFish.push(A[i]);
            }
        }


        cnt += downFish.size();

        return cnt;
    }

    public static void main(String[] args) {
        int res = solution(new int[]{4,3,2,1,5}, new int[]{0,1,0,0,0});
    }
}
