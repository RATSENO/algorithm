package example.programmers;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        int val = 0;
        Map <String, Integer> hashmap = new HashMap<>();
        for(String part : participant){
            //맵에 해당 값이 없을 경우 value값을 1로 셋팅
            if(hashmap.get(part) == null){
                hashmap.put(part, 1);
            }else{
                //맵에 해당 값이 있을 경우 1을 추가하여 셋팅
                val = hashmap.get(part) + 1;
                hashmap.put(part, val);
            }
        }

        for(String comp : completion){
            //완주자의 값으로 hashmap에서 확인하여 -1한 값을 셋팅
            val = hashmap.get(comp) -1;
            hashmap.put(comp, val);
        }

        for(String key : hashmap.keySet()){
            //해당 값이 1과 같을경우 완주하지 못한것
            //완주했을 경우 0
            if(hashmap.get(key)==1){
                answer = key;
            }

        }
        return answer;
    }
}
