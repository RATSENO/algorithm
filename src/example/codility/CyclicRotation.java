package example.codility;

import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        if (A.length ==0){
            return A;
        }

        if(K ==0){
            return A;
        }

        if(A.length > 100 || K>100){
            return A;
        }

        int[] result = new int[A.length];

        for(int i=0; i<K; i++){
            int last = A[A.length-1];
            for(int j=0; j<A.length-1; j++){
                result[j+1]=A[j];
            }
            result[0]=last;
            A=result.clone();
        }
        return result;
    }

    public static void main(String[] args) {
        solution(new int[]{-4},0);
    }
}
