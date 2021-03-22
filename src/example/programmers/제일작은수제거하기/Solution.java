package example.programmers.제일작은수제거하기;

import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr) {
        if(arr.length==0|| arr.length==1){
            return new int[]{-1};
        }
        int minValue=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(minValue>arr[i]){
                minValue = arr[i];
            }
        }
        int finalMinValue = minValue;
        return Arrays.stream(arr).filter(v->v!= finalMinValue).toArray();
    }


    public static int[] solution2(int[] inputArr) {
        int[] answerArr = {};
        if(inputArr.length == 1 || inputArr.length == 0) {
            return new int[]{-1};
        }else {
            int minimumValue = 0;
            int minimumValueIdx = 0;
            for(int i = 0; i<inputArr.length; i++) {
                if(i == 0) {
                    minimumValue = inputArr[i];
                }

                if(minimumValue > inputArr[i]) {
                    minimumValue = inputArr[i];
                    minimumValueIdx = i;
                }
            }
            int cnt = 0;
            answerArr = new int[inputArr.length -1];
            for(int i=0; i<inputArr.length; i++) {
                if(minimumValueIdx == i) {
                    continue;
                }
                answerArr[cnt++] = inputArr[i];
            }
        }
        return answerArr;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1,2,3,4,6});
    }
}
