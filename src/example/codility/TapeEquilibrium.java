package example.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {

    public static int solution(int[] A) {
        List sumList = new ArrayList();

        int left = 0;
        int right = 0;
        int sum = 0;

        for(int num : A){
            sum += num;
        }

        for(int i=1; i<A.length; i++){
            left += A[i-1];
            right = sum - left;
            sumList.add(Math.abs(left-right));
        }

        return (int) Collections.min(sumList);
    }

    public static void main(String[] args) {
        int res = solution(new int[]{3, 1, 2, 4, 3});
    }
}
