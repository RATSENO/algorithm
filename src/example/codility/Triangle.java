package example.codility;

import java.util.Arrays;

public class Triangle {

    static int solution(int[] A){
        Arrays.sort(A);

        for(int i=0; i<A.length-2; i++){
            if(A[i]> A[i+2] -A[i+1]){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int res = solution(new int[]{1,2,3,4,5});

    }
}
