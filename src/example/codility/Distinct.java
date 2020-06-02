package example.codility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Distinct {

    static int solution(int[] A){
        Set<Integer> set = new HashSet<>();

        for (int i : A) {
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int res = solution(new int[]{0,0,0,0,144});
    }
}
