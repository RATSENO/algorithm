package example.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    static int solution(int[] A){
        Arrays.sort(A);

        int res = 0;
        int last = A.length -1;

        res = A[last] * A[last-1] *  A[last-2];

        if(A[0]<=0 && A[1] <=0 && A[last] >=0){
            int res2 = A[0] * A[1] * A[last];

            if(res2 > res){
                res = res2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int res = solution(new int[]{-3, 1, 2, -2, 5, 6});
    }
}
