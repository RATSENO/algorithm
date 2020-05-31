package example.codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solution(int[] A){
        HashSet<Integer> set = new HashSet<>();

        for(Integer a : A){
            set.add(a);
        }

        for(int i=1; i<Integer.MAX_VALUE; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = solution(new int[]{1, 3, 6, 4, 1, 2});
        //1, 2, 3
        //-1, -3
    }
}
