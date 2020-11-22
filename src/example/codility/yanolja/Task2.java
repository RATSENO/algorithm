package example.codility.yanolja;

import java.util.HashMap;

public class Task2 {
    private static int solution(int[] A) {

        int sum = 0;
        int index = 0;
        int maximum = 0;

        if(A.length > 1000000 || A.length == 0){
            return 0;
        }

        while (index < A.length) {
            while (index < A.length && A[index] < 0) {
                index++;
                continue;
            }
            while (index < A.length && 0 <= A[index]) {
                if(A[index]< -1000 || A[index]>1000){
                    return 0;
                }
                sum += A[index++];
                maximum = Math.max(maximum, sum);
            }
            sum = 0;
        }
        return maximum;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{-1,2000,1,2,0,2,1,-3,4,3,0,1});
    }
}
