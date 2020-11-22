package example.codility.yanolja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task1 {

    private static int solution(int[] A) {
        int res = 0;

        //arr A => validation
        if(A.length == 0 || A.length > 1000){
            return res;
        }

        Arrays.sort(A);
        List<Integer> oneDigitArr = new ArrayList<Integer>();

        for (int i : A) {
            // i => validation
            if(i<-10000 || i>10000){
                return res;
            }

            if(i/10 == 0){
                oneDigitArr.add(i);
            }
        }

        if(oneDigitArr.size()==0){
            return res;
        }else{
            //result get
            res = oneDigitArr.get(oneDigitArr.size()-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int solution = solution(new int[]{10000});
    }
}
