package example.codility;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    static int solution(int[] A){
        int half = A.length/2 + 1;

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : A) {
            Integer findNum = map.get(i);
            if(findNum == null){
                map.put(i, 1);
            }else{
                map.put(i, findNum+1);
            }
        }

        int dominator = 0;
        for (Integer integer : map.keySet()) {
            if(map.get(integer) >= half){
                dominator = integer;
                break;
            }
        }
        if(dominator == 0){
            return -1;
        }else{
            for(int i=0; i<A.length; i++){
                if(A[i]==dominator){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int res = solution(new int[]{3,4,3,2,3,-1,3, 3});
    }
}

