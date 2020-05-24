package example.codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer findNumber = map.get(A[i]);
            if (findNumber == null) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], findNumber+1);
            }
        }

        for (Integer num : map.keySet()) {
            if (map.get(num) % 2 ==1) {
                res = num;
            }
        }


        return res;
    }

    public static void main(String[] args) {
        int res = solution(new int[] {9, 3, 9, 3, 9, 7, 9});
    }
}
